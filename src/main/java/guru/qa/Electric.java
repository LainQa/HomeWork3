package guru.qa;

public class Electric {
    String model;
    int price;
    int battery;

    public Electric(String model, int price, int battery) {
        this.model = model;
        this.price = price;
        this.battery = battery;
    }

    public void saySpecs () {
        System.out.println("Model: "+model+ System.lineSeparator() + "Price in USD: " + price + System.lineSeparator() + "Battery capacity in kWh: "+ battery);
    }
    public void discount(){
        price = price / 2;
        battery = battery + 8;
    }



}

