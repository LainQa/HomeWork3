package guru.qa;

public class Gasoline {
    String car;
    String model;
    int maxSpeed;

    public void printInfo() {
        System.out.println("Car brand: "+ car);
        System.out.println("Machine model: "+ model);
        System.out.println("Max speed: "+ maxSpeed);
    }

    public Gasoline(String car, String model, int maxSpeed ){
        this.car = car;
        this.model = model;
        this.maxSpeed = maxSpeed;
        printInfo();

    }
}
