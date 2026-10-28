package de.tum.cit.fop;

public class Library {
    private String name;
    private int books;
    private double openingHours;
    private String location;
    public Library(String name, int books, double openingHours, String location) {
        this.name = name;
        this.books = books;
        this.openingHours = openingHours;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBooks() {
        return books;
    }

    public void setBooks(int books) {
        this.books = books;
    }

    public double getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(double openingHours) {
        this.openingHours = openingHours;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                ", openingHours=" + openingHours +
                ", location='" + location + '\'' +
                '}';
    }
    public String getDisplayName(){
        return (this.name+"Library ("+this.books+"books at "+this.location);
    }
    public double getBooksPerHour(){
        return books/openingHours;
    }
    public boolean hasManyBooks(){
        if(this.books>10000){
            return true;
        }else
            return false;
    }

}
