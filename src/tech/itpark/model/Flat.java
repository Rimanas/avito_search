package tech.itpark.model;

public class Flat {
    private int id;
    private String district;
    private int price;
    private int floor;
    private int numberOfRooms;

    public Flat(int id, String district, int price, int floor, int numberOfRooms) {
        this.id = id;
        this.district = district;
        this.price = price;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "id=" + id +
                ", districts=" + district +
                ", price=" + price +
                ", floor=" + floor +
                ", numberOfRooms=" + numberOfRooms +
                '}';
    }
}
