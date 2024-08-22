public class cars {

    private String make;
    private String model;
    private int year;
    private String color;
    private String engine;
    private double enginsize;
    private String fueltype;
    private double price;

    public cars(String make, String model, int year, String color, double enginsize, String fueltype, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engine = engine;
        this.enginsize = enginsize;
        this.fueltype = fueltype;
        this.price = price;

    }

    public String getcolor() {
        return color;
    }

    public String getmake() {
        return make;
    }

    public int getyear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getengine() {
        return engine;
    }

    public double getenginesize() {
        return enginsize;
    }

    public String getfueltype() {
        return fueltype;
    }

    public double getprice() {
        return price;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", enginSize=" + enginsize +'\''+
                ", fuelType='" + fueltype + '\'' +
                ", price=" + price +
                '}';

    }
}