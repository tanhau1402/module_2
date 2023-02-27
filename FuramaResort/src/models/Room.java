package models;

public class Room extends Facility {
    private String serviceFree;


    public static int value = 0;

    public Room() {

    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String serviceName, double usableArea, double rentalCost, int maxNumberOfPeople, String rentalType, String serviceFree) {
        super(serviceName, usableArea, rentalCost, maxNumberOfPeople, rentalType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public static int valueRoom() {
        return ++value;
    }

    @Override
    public String toString() {
        return "Service Free : " + serviceFree;
    }
}
