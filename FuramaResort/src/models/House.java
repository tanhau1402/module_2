package models;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;
    private static int value = 0;

    public House() {

    }

    public House(String roomStandard, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String serviceName, double usableArea, double rentalCost, int maxNumberOfPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(serviceName, usableArea, rentalCost, maxNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public static int valueHouse() {
        return ++value;
    }

    @Override
    public String toString() {
        return "Room Standard :" + roomStandard
                + "Number of Floors : " + numberOfFloors;
    }
}
