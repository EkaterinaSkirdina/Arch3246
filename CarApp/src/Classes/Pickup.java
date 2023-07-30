package Classes;

import java.awt.Color;

public class Pickup extends Car implements iRefueling{

    private int loadCapacity;
    public Pickup(String make, String model, Color color, TypeCar bodyType, int numberWheels, TypeFuel fuel,
            TypeGearBox gearBox, float engineCap, int loadCapacity) {
        super(make, model, color, bodyType, numberWheels, fuel, gearBox, engineCap);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public int gearShift(int gear) {
        return 0;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void fuel() {}
    
}
