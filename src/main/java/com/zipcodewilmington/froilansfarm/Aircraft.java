package com.zipcodewilmington.froilansfarm; // DONE

public class Aircraft extends Vehicle{
    private boolean inAir = false;

    public boolean fly() {
        boolean successful = false;
        if (inAir == false) {
            successful = true;
            inAir = true;
        }
        return successful;
    }

    public boolean land() {
        boolean successful = false;
        if (inAir == true) {
            successful = true;
            inAir = false;
        }
        return successful;
    }

    public boolean inAirStatus() {
        return inAir;
    }
}
