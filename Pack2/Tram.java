package Pack2;

import Pack3.Metro;

public class Tram extends Metro {
 private int yearOfCreation;
    private  long serialNumber;
    private static long serialNumCount = 30000;

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }


    @Override
    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Tram(int numberOfWheels, double maximumSpeed, int numberOfVehicles, String nameOfStartingStation, String nameOfDestinationStation, int totalNumberOfStops, int yearOfCreation) {
        super( numberOfWheels, maximumSpeed, numberOfVehicles, nameOfStartingStation, nameOfDestinationStation, totalNumberOfStops );
        this.yearOfCreation = yearOfCreation;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }
    public Tram(){
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);

    }

    public Tram (Tram tram) {
        setNumberOfVehicles( tram.getNumberOfVehicles() );
        setMaximumSpeed( tram.getMaximumSpeed() );
        setNumberOfVehicles( tram.getNumberOfVehicles() );
        setNameOfStartingStation( tram.getNameOfStartingStation() );
        setNameOfDestinationStation( tram.getNameOfDestinationStation() );
        setTotalNumberOfStops( tram.getTotalNumberOfStops() );
        yearOfCreation = tram.yearOfCreation;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }
     public boolean equals ( Object object){
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return  false;
        if(!super.equals( object )) return false;
        Tram tram = (Tram)object;
        return yearOfCreation == tram.yearOfCreation;


     }
    @Override
    public String toString ( ) {
        return "This Tram" +
                "-serial#" + serialNumber +
                "-has " + getNumberOfWheels() + " wheels" +
                ", has a maximumSpeed of " + getMaximumSpeed() + "km/hr. " +
                "It has " + getNumberOfVehicles() + " vehicles and its starting and destination stations are " +
                getNameOfStartingStation() + " and " + getNameOfDestinationStation() + " and total Number Of Stops is " + getTotalNumberOfStops() + " stops" +
                " and it's year of creation is " + yearOfCreation ;
    }

    public static Long getNextSerialNumber(Long serialNumber) {
        serialNumber++; // Increment the serial number by 1
        return serialNumber; // Return the updated serial number
    }
}