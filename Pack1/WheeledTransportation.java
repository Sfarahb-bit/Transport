package Pack1;

public class WheeledTransportation {
   private int numberOfWheels;
    private double maximumSpeed;
    private Long serialNumber;
    private static Long serialNumCount=0L;


    public WheeledTransportation(int numberOfWheels, double maximumSpeed) {
        this.numberOfWheels = numberOfWheels;
        this.maximumSpeed = maximumSpeed;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }

    public WheeledTransportation(WheeledTransportation wheeledTransportation) {
        this.numberOfWheels = numberOfWheels;
        this.maximumSpeed = maximumSpeed;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }


    public WheeledTransportation( ){
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);

    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public Long getSerialNumber() {
        return serialNumber;
    }
    public boolean equals(Object object) {
        if(object == null || this.getClass() != object.getClass()){
            return false;
        }else {
            WheeledTransportation wheeledTransportation = (WheeledTransportation) object;
            if(this.maximumSpeed == wheeledTransportation.maximumSpeed
                    && this.numberOfWheels == wheeledTransportation.numberOfWheels){
                return true;
            }
            return false;
        }
    }

    @Override

    public String toString() {
        return "This WheeledTransportation" +
                "-serial#" + serialNumber +
                "-has " + numberOfWheels +" wheels"+
                ", has a maximumSpeed of " + maximumSpeed +"km/hr. ";
    }


        public static Long getNextSerialNumber(Long serialNumber) {
            serialNumber++; // Increment the serial number by 1
            return serialNumber; // Return the updated serial number
        

        }
    }


