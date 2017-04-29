package com.test;

/**
 * Created by amarchattiwar on 4/12/17.
 */
public class PackageDocument implements Comparable<PackageDocument> {

    private String docId;

    private Integer docIndex;

    private Long createdDate;

    public PackageDocument(String docId, Integer docIndex, Long createdDate) {
        this.docId = docId;
        this.docIndex = docIndex;
        this.createdDate = createdDate;
    }

    public Integer getDocIndex() {
        return docIndex;
    }

    public Long getCreatedDate() {
        return createdDate;
    }

    @Override
    public String toString() {
        return "PackageDocument{" +
                "docId='" + docId + '\'' +
                ", docIndex=" + docIndex +
                ", createdDate=" + createdDate +
                '}';
    }

    @Override
    public int compareTo(PackageDocument o) {
        int c = 0;
        if (this.getDocIndex() != null && o.getDocIndex() != null)
            c = this.getDocIndex().compareTo(o.getDocIndex());

        if (c == 0 && this.getCreatedDate() != null && o.getCreatedDate() != null)
            c = o.getCreatedDate().compareTo(this.getCreatedDate());

        return c;
    }
}
