package models;

public class Villa extends Facility {
    private String roomStandard;
    private double swimmingPoolArea;
    private int numberOfFloors;
    public static int value = 0;

    public Villa() {

    }

    public Villa(String roomStandard, double swimmingPoolArea, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String serviceName, double usableArea, double rentalCost, int maxNumberOfPeople, String rentalType, String roomStandard, double swimmingPoolArea, int numberOfFloors) {
        super(serviceName, usableArea, rentalCost, maxNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public static int valueVilla() {
        return ++value;
    }

    @Override
    public String toString() {
        return "Room Standard : " + roomStandard
                + "Swimming Pool Area : " + swimmingPoolArea
                + "Number of Floors : " + numberOfFloors;
    }
}
