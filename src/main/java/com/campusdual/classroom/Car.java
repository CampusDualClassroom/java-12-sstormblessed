package com.campusdual.classroom;

public class Car {

    public static final int MAX_SPEED = 200;
    public int tachometer = 0;
    public int speedometer = 0;
    public String gear = "N";
    public int wheelsAngle;

    public Car() {
    }

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehiculo encendido");
        } else {
            System.out.println("O vehiculo xa esta encendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            tachometer = 0;
            System.out.println("Vehiculo apagado");
        } else {
            System.out.println("Non se pode apagar o vehículo, primeiro ten que estar detido");
        }
    }

    public void accelerate() {
        if (speedometer < MAX_SPEED) {
            speedometer += 10;
        } else {
            System.out.println("Velocidade maxima, frena");
        }
    }

    public void brake() {
        if (speedometer > 0) {
            speedometer -= 10;
        } else {
            System.out.println("O coche esta parado, acelera");
        }
    }

    public void turnAngleOfWheels(int angle) {
        if (angle + wheelsAngle > 45) {
            wheelsAngle = 45;
        } else if (angle + wheelsAngle < -45 ) {
            wheelsAngle = -45;
        } else {
            wheelsAngle = angle;
        }
    }

    public void setReverse(boolean reverse) {
        if (reverse && speedometer == 0) {
            gear = "R";
        } else {
            gear = "N";
        }
    }

    public boolean isTachometerGreaterThanZero() {
        return tachometer > 0;
    }

    public boolean isTachometerEqualToZero() {
        return tachometer == 0;
    }

}
