package Pack5;

import java.util.Objects;

public class WorldWarIIAiroplane extends Aircraft {
    private boolean twinengine;
    private Long serialNumber;
    private static Long serialNumCount = 80000L;

    public boolean isTwinengine() {
        return twinengine;
    }

    public void setTwinengine(boolean twinengine) {
        this.twinengine = twinengine;
    }

    @Override
    public void setSerialnumber(Long serialnumber) {
        this.serialNumber = serialnumber;
    }

    public WorldWarIIAiroplane(boolean twinengine, double price, double maximumElevation) {
        super(price,maximumElevation);
        this.twinengine = twinengine;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);

    }

    public WorldWarIIAiroplane() {
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }


    public WorldWarIIAiroplane(WorldWarIIAiroplane worldWarIIAiroplane) {
        setPrice( worldWarIIAiroplane.getPrice() );
        setMaximumElevation( worldWarIIAiroplane.getMaximumElevation() );
        this.twinengine = worldWarIIAiroplane.twinengine;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);

    }

    @Override
   public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        } else {
            WorldWarIIAiroplane worldWarIIAiroplane =(WorldWarIIAiroplane) object;
            if (!super.equals( object )) return false;
            return twinengine == worldWarIIAiroplane.twinengine;
        }

    }

    @Override
    public String toString() {
          return "This WordWarrII Airplane " +
                ", serialnumber= " + serialNumber +
                " it's  price=" + getPrice() + " $ " +
                ", it's maximumElevation= " + getMaximumElevation() + " feets. " +
                "  It has twinEngin : " + isTwinengine();

    }

    public static Long getNextSerialNumber(Long serialNumber) {
        serialNumber++; // Increment the serial number by 1
        return serialNumber; // Return the updated serial number
    }
}