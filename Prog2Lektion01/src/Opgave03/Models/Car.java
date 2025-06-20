package Opgave03.Models;

    public class Car {
        private int topSpeed;
        private int acceleration;
        private int currentSpeed = 0;

        public Car(int topSpeed, int acceleration) {
            this.topSpeed = topSpeed;
            this.acceleration = acceleration;
        }

        public void displayInfo() {
            System.out.println(this.getClass().getSimpleName() + ", current speed: " + currentSpeed);
        }

        public void accelerate() {
            currentSpeed += (topSpeed - currentSpeed) * acceleration / 100;
        }

        public void brake() {
            currentSpeed -= (currentSpeed) * 30 / 100;
        }
    }

