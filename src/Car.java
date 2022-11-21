public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand == " ") {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model == " ") {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (country == null || country == " ") {
            this.country = "default";
        } else {
            this.country = country;
        }

        if (color == null || color == " ") {
            this.color = "white";
        } else {
            this.color = color;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (year <= 0) {
            this.engineVolume = 2000;
        } else {
            this.year = year;
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}
