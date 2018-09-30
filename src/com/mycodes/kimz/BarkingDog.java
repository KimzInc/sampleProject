package com.mycodes.kimz;

public class BarkingDog {

    private boolean isBarking;
    private int hourOfDay;

    public BarkingDog(boolean isBarking, int hourOfDay) {
        this.isBarking = isBarking;
        this.hourOfDay = hourOfDay;
    }

    public int getHourOfDay() {
        return hourOfDay;
    }

    public boolean isBarking() {
        return isBarking;
    }

    @Override
    public String toString() {
        return "BarkingDog{" +
                "isBarking=" + isBarking +
                ", hourOfDay=" + hourOfDay +
                '}';
    }
}
