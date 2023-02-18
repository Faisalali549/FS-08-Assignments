package com.example.library.model;


public class Library {
    private String libraryName;
    private String libraryAdd;
    private String libraryNumber;
    private String Facilities;
    private int LibraryId;

    public Library(String libraryName, String libraryAdd, String libraryNumber, String facilities, int libraryId) {
        this.libraryName = libraryName;
        this.libraryAdd = libraryAdd;
        this.libraryNumber = libraryNumber;
        Facilities = facilities;
        LibraryId = libraryId;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryAdd() {
        return libraryAdd;
    }

    public void setLibraryAdd(String libraryAdd) {
        this.libraryAdd = libraryAdd;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public void setLibraryNumber(String libraryNumber) {
        this.libraryNumber = libraryNumber;
    }

    public String getFacilities() {
        return Facilities;
    }

    public void setFacilities(String facilities) {
        Facilities = facilities;
    }

    public int getLibraryId() {
        return LibraryId;
    }

    public void setLibraryId(int libraryId) {
        LibraryId = libraryId;
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryName='" + libraryName + '\'' +
                ", libraryAdd='" + libraryAdd + '\'' +
                ", libraryNumber='" + libraryNumber + '\'' +
                ", Facilities='" + Facilities + '\'' +
                ", LibraryId=" + LibraryId +
                '}';
    }
}
