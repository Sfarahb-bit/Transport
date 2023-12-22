package Pack5;

import Pack1.WheeledTransportation;

public class Aircraft {
    private double price;
    private double maximumElevation;
    private  Long serialNumber ;
    private static Long serialNumCount = 0L;

    public Aircraft(double price, double maximumElevation) {
        this.price = price;
        this.maximumElevation = maximumElevation;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);

    }

    public Aircraft() {
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);

    }

    public Aircraft(Aircraft aircraft) {
        this.price = price;
        this.maximumElevation = maximumElevation;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public double getMaximumElevation() {
        return maximumElevation;
    }

    public void setMaximumElevation(double maximumElevation) {

        this.maximumElevation = maximumElevation;
    }


    public void setSerialnumber(Long serialNumber) {

        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object object) {

        if (object == null || this.getClass() != object.getClass()) {
            return false;

        } else {
            Aircraft aircraft = (Aircraft) object;
            if (this.price == aircraft.price &&
                    this.maximumElevation == aircraft.maximumElevation) {
                return true;
            }
                return false;

        }
    }
        @Override
        public String toString ( ) {
            return "This Aircraft" +
                    ", serialnumber= " + serialNumber +
                    " it's  price=" + price + " $ " +
                    ",and it's maximumElevation= " + maximumElevation + " feets";

        }
        public static Long getNextSerialNumber (Long serialNumber) {
            serialNumber++; // Increment the serial number by 1
            return serialNumber; // Return the updated serial number
        }

}
