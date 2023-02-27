package models;

public abstract class Facility {
    private String serviceName;
    private double usableArea;
    private double rentalCost;
    private int maxNumberOfPeople;
    private String rentalType;

    public Facility() {

    }

    public Facility(String serviceName, double usableArea, double rentalCost, int maxNumberOfPeople, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility :" + "Service Name :"
                + serviceName + "Usable Area : "
                + usableArea + " Rental Cost : "
                + rentalCost + "Max number of people : " + maxNumberOfPeople
                + "Rental Type : " + rentalType;
    }
}
