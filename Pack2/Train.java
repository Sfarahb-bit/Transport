package Pack2;

import Pack1.WheeledTransportation;

public class Train extends WheeledTransportation {
    private int numberOfVehicles;
    private String nameOfStartingStation;
    private String nameOfDestinationStation;
    private  long serialNumber;
    private static long serialNumCount = 10000;

    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    public void setNumberOfVehicles(int numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }

    public String getNameOfStartingStation() {
        return nameOfStartingStation;
    }

    public void setNameOfStartingStation(String nameOfStartingStation) {
        this.nameOfStartingStation = nameOfStartingStation;
    }

    public String getNameOfDestinationStation() {
        return nameOfDestinationStation;
    }

    public void setNameOfDestinationStation(String nameOfDestinationStation) {
        this.nameOfDestinationStation = nameOfDestinationStation;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Train() {
        numberOfVehicles = 4;
        nameOfStartingStation = "Montral";
        nameOfDestinationStation = "Toronto";
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);

    }

    public Train(int numberOfWheels, double maximumSpeed, int numberOfVehicles, String nameOfStartingStation, String nameOfDestinationStation) {
        super( numberOfWheels, maximumSpeed );
        this.numberOfVehicles = numberOfVehicles;
        this.nameOfStartingStation = nameOfStartingStation;
        this.nameOfDestinationStation = nameOfDestinationStation;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }

    public Train(Train train) {
        setNumberOfVehicles( train.getNumberOfVehicles() );
        setNameOfDestinationStation( train.getNameOfDestinationStation() );
        setNameOfStartingStation( train.getNameOfStartingStation() );
        setMaximumSpeed( train.getMaximumSpeed() );
        setNumberOfWheels( train.getNumberOfWheels() );
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);

    }

    @Override
    public String toString() {
        return "This Train" +
                "-serial#" + serialNumber +
                "-has " + getNumberOfWheels() + " wheels" +
                ", has a maximumSpeed of " + getMaximumSpeed() + "km/hr. " +
                "It has " + numberOfVehicles + " vehicles and its starting and destination stations are " +
                nameOfStartingStation + " and " + nameOfDestinationStation + ".";
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        } else {
            Train train = (Train) object;
            if (this.getMaximumSpeed() == train.getMaximumSpeed()
                    && this.getNumberOfWheels() == train.getNumberOfWheels()
                    && this.numberOfVehicles == ( (Train) object ).numberOfVehicles
                    && this.nameOfStartingStation.equals( ( (Train) object ).nameOfStartingStation )
                    && this.nameOfDestinationStation.equals( nameOfDestinationStation )) {
                return true;
            }
            return false;
        }

    }
    public static Long getNextSerialNumber (Long serialNumber) {
        serialNumber++; // Increment the serial number by 1
        return serialNumber; // Return the updated serial number
    }


    }