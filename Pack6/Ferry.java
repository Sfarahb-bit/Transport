package Pack6;

import java.util.Objects;

public class Ferry {
    private double maximumSpeed;
    private  double maximumLoad;
    private long serialNumber;
    private static long serialNumCount = 70000;

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public double getMaximumLoad() {
        return maximumLoad;
    }

    public void setMaximumLoad(double maximumLoad) {
        this.maximumLoad = maximumLoad;
    }

    public  void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }


    public Ferry(double maximumSpeed, double maximumLoad) {
        this.maximumSpeed = maximumSpeed;
        this.maximumLoad = maximumLoad;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }

    public Ferry(){
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }


    public Ferry(Ferry ferry){
        maximumSpeed = ferry.getMaximumSpeed();
        maximumLoad = ferry.getMaximumLoad();
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }

    @Override
    public boolean equals(Object object) {

        if (object == null || getClass() != object.getClass()) {
            return false;
        } else {
            Ferry ferry = (Ferry) object;
            if (this.maximumSpeed == ferry.maximumSpeed
                    && this.maximumLoad == ferry.maximumLoad) {
                return true;
            }
            return false;

        }
    }

    @Override
    public String toString() {
        return "This Ferry  serial # : " + serialNumber +
        " It 's  maximumSpeed= " + maximumSpeed + "Km/hr" +
                "and it's maximumLoad= " + maximumLoad +
                ".";
    }
    public static Long getNextSerialNumber(Long serialNumber) {
        serialNumber++; // Increment the serial number by 1
        return serialNumber; // Return the updated serial number
    }
}
