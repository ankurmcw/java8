package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by amarchattiwar on 7/18/16.
 */
public class Test2 implements Runnable {

    private MappedByteBuffer buffer;
    private long position;
    private FileChannel channel;

    Test2 (MappedByteBuffer buffer, long position, FileChannel channel) {
        this.buffer = buffer;
        this.position = position;
        this.channel = channel;
    }

    public static void main(String[] args) throws IOException {
        usingFileChannel();
    }

    static void usingFileChannel() throws IOException {
        long start = System.currentTimeMillis();
        FileChannel channel = new FileInputStream("/home/amarchattiwar/Desktop/handbook.pdf").getChannel();
        long channelSize = channel.size() - 1;
        System.out.println("Channel size: " + channelSize);
        List<MappedByteBuffer> bufferList = new ArrayList<>();
        long range = channelSize/2;
        long startIndex = 0l;
        long endIndex = range;
        while (true) {
            if(range < channelSize) {
                MappedByteBuffer byteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, startIndex, endIndex);
                startIndex = endIndex + 1l;
                channelSize -= range;
                bufferList.add(byteBuffer);
            } else {
                MappedByteBuffer byteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, startIndex, channelSize);
                bufferList.add(byteBuffer);
                break;
            }
        }
        channel.close();
        System.out.println("Time to read file (usingFileChannel): " + (System.currentTimeMillis() - start));
        System.out.println("Total byte buffers: " + bufferList.size());
        channel = new FileOutputStream("/home/amarchattiwar/Desktop/handbook_new.pdf").getChannel();
        long totalTime = 0l;
        long totalFileSize = 0l;
        long position = 0l;
        for(int i=0; i<bufferList.size(); i++) {
            start = System.currentTimeMillis();
            channel.write(bufferList.get(i), position);
            position = bufferList.get(i).capacity();
            totalTime += System.currentTimeMillis() - start;
            System.out.println("Time to write file (usingFileChannel " + i +"): " + (System.currentTimeMillis() - start));
            totalFileSize += bufferList.get(i).capacity();
        }
        channel.close();
        System.out.println("Total time taken: " + totalTime);
        System.out.println("Total file size: " + totalFileSize);
    }

    @Override
    public void run() {
        try {
            System.out.println("Starting to write to file");
            channel.write(this.buffer, this.position);
            System.out.println("Finished writing");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
