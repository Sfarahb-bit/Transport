package Pack3;

import Pack2.Train;

public class Metro extends Train {

    private int totalNumberOfStops;
    private  long serialNumber;
    private static long serialNumCount =25000L ;


    public int getTotalNumberOfStops() {

        return totalNumberOfStops;
    }

    public void setTotalNumberOfStops(int totalNumberOfStops) {

        this.totalNumberOfStops = totalNumberOfStops;
    }
    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }
    public Metro(int numberOfWheels, double maximumSpeed, int numberOfVehicles, String nameOfStartingStation, String nameOfDestinationStation, int totalNumberOfStops) {
        super( numberOfWheels, maximumSpeed, numberOfVehicles, nameOfStartingStation, nameOfDestinationStation );
        this.totalNumberOfStops = totalNumberOfStops;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }
    public Metro (){
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);

    }
    public Metro(Metro metro) {
        totalNumberOfStops = metro.totalNumberOfStops;
        setNumberOfWheels( metro.getNumberOfWheels() );
        setMaximumSpeed( metro.getMaximumSpeed() );
        setNumberOfVehicles( metro.getNumberOfVehicles() );
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);

    }



    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals( object )) return false;
        Metro metro = (Metro) object;
        return totalNumberOfStops == metro.totalNumberOfStops ;
    }


    @Override
    public String toString ( ) {
        return "This Metro" +
                "-serial#" + serialNumber +
                "-has " + getNumberOfWheels() + " wheels" +
                ", has a maximumSpeed of " + getMaximumSpeed() + "km/hr. " +
                "It has " + getNumberOfVehicles() + " vehicles and its starting and destination stations are " +
                getNameOfStartingStation() + " and " + getNameOfDestinationStation() + " and total Number Of Stops is " + totalNumberOfStops + " stops";
    }

    public static Long getNextSerialNumber(Long serialNumber) {
        serialNumber++; // Increment the serial number by 1
        return serialNumber; // Return the updated serial number
    }

}

