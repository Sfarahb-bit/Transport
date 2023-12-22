package Pack4;

import Pack1.WheeledTransportation;

import java.security.PublicKey;

public class Monowheel extends WheeledTransportation {
private double maximumWeight;
    private  Long serialNumber;
    private static Long serialNumCount= 55000L ;

    public double getMaximumWeight() {
        return maximumWeight;
    }

    public void setMaximumWeight(double maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Monowheel(int numberOfWheels, double maximumSpeed, double maximumWeight) {
        super( numberOfWheels, maximumSpeed );
        this.maximumWeight = maximumWeight;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }

    public Monowheel(){
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);

    }

    public Monowheel(Monowheel monowheel){
        setNumberOfWheels( monowheel.getNumberOfWheels() );
        setMaximumSpeed( monowheel.getMaximumSpeed() );
        maximumWeight = monowheel.maximumWeight;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);

    }

    public boolean equals (Object object){
       if (object == null || this.getClass() != object.getClass()){
           return false;
       }else{
           Monowheel monowheel = (Monowheel) object;
           if(this.getNumberOfWheels() == monowheel.getNumberOfWheels()
                  && this.getMaximumSpeed() == monowheel.getMaximumSpeed()
                   && this.maximumWeight ==  monowheel.maximumWeight )  {
               return true;
           }
           return false;
       }

    }

    @Override
    public String toString() {
        return "This Monowheel " +
                "-serial#" + serialNumber +
                "-has " + getNumberOfWheels() +" wheels"+
                ", has a maximumSpeed of " + getMaximumSpeed() +"km/hr " +
                "and has a maximumWeight of " + maximumWeight + "kg";
    }
    public static Long getNextSerialNumber(Long serialNumber) {
        serialNumber++; // Increment the serial number by 1
        return serialNumber; // Return the updated serial number
    }
}

