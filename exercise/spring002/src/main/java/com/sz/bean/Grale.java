package com.sz.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Grale {

    private String[] frie;
    private List<Integer> noe;
    private Set<Book> books;
    private Map<String, Fies1> fies1Map;

    @Override
    public String toString() {
        return "Grale{" +
                "frie=" + Arrays.toString(frie) +
                ", noe=" + noe +
                ", books=" + books +
                ", fies1Map=" + fies1Map +
                '}';
    }

    public Map<String, Fies1> getFies1Map() {
        return fies1Map;
    }

    public void setFies1Map(Map<String, Fies1> fies1Map) {
        this.fies1Map = fies1Map;
    }

    public List<Integer> getNoe() {
        return noe;
    }

    public void setNoe(List<Integer> noe) {
        this.noe = noe;
    }

    public String[] getFrie() {
        return frie;
    }

    public void setFrie(String[] frie) {
        this.frie = frie;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
