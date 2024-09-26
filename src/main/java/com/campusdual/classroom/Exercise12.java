package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car coche = new Car();

        coche.isTachometerEqualToZero();
        coche.start();
        coche.start();
        coche.stop();
        coche.stop();
        coche.accelerate();
        while (coche.speedometer != 0) {
            coche.accelerate();
        }
        coche.brake();
        while (coche.speedometer > 0) {
            coche.brake();
        }
        coche.turnAngleOfWheels(20);
        coche.turnAngleOfWheels(200);
        coche.turnAngleOfWheels(-200);
        coche.setReverse(true);
        coche.accelerate();
        coche.setReverse(true);
    }

}