package Classes;

import java.awt.*;
/**
 * Абстрактный класс машина
 */
public abstract class Car {

    private String make;
    private String model;
    private Color color;
    private TypeCar bodyType;
    private int numberWheels;
    private TypeFuel fuel;
    private TypeGearBox gearBox;
    private float engineCap;

    /**
     * @param make
     * @param model
     * @param color
     * @param bodyType
     * @param numberWheels
     * @param fuel
     * @param gearBox
     * @param engineCap
     */
    public Car(String make,
            String model,
            Color color,
            TypeCar bodyType,
            int numberWheels,
            TypeFuel fuel,
            TypeGearBox gearBox,
            float engineCap) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.numberWheels = numberWheels;
        this.fuel = fuel;
        this.gearBox = gearBox;
        this.engineCap = engineCap;
    }

    /**
     * 
     */
    public void movement() {
    }

    public void maintenance() {
    }

    public abstract int gearShift(int gear);

    public boolean turnLights() {
        return true;
    }

    public boolean turnWipers() {
        return true;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TypeCar getBodyType() {
        return bodyType;
    }

    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public TypeFuel getFuel() {
        return fuel;
    }

    public void setFuel(TypeFuel fuel) {
        this.fuel = fuel;
    }

    public TypeGearBox getGearBox() {
        return gearBox;
    }

    public void setGearBox(TypeGearBox gearBox) {
        this.gearBox = gearBox;
    }

    public float getEngineCap() {
        return engineCap;
    }

    public void setEngineCap(float engineCap) {
        this.engineCap = engineCap;
    }

}