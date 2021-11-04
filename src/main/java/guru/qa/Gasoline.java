package guru.qa;

public class Gasoline {
    String car;
    String model;
    int maxSpeed;

    public void printInfo() {
        System.out.println(car+"\n"+model+"\n"+maxSpeed);
    }

    public Gasoline(String car, String model, int maxSpeed ){
        this.car = car;
        this.model = model;
        this.maxSpeed = maxSpeed;
        printInfo();

    }
}
