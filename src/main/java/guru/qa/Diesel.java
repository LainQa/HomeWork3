package guru.qa;

public class Diesel {
    String car;
    String model;
    int maxSpeed;

    public void printInfo() {
        System.out.println(car+"\n"+model+"\n"+maxSpeed);
    }

    public Diesel(String car, String model, int maxSpeed ){
        this.car = car;
        this.model = model;
        this.maxSpeed = maxSpeed;
        printInfo();
    }
}
