package transport;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNum;
    private final int seatsNum;
    private boolean winterRubber;



    public class Key{
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteEngineStart=" + remoteEngineStart +
                    ", keylessAccess=" + keylessAccess +
                    '}';
        }
    }

    public static class Insurance {
        private final LocalDate validityMonthsPeriod;
        private final double cost;
        private final String id;

        public Insurance(LocalDate validityMonthsPeriod, double cost, String id) {
            this.validityMonthsPeriod = checkDuration(validityMonthsPeriod);
            if (cost < 0) {
                this.cost = 1000;
            } else {
                this.cost = cost;
            }
            if (id == null || id == " ") {
                this.id = "default";
            } else {
                this.id = id;
            }
        }

        public boolean isValidId(String id){
            if (Pattern.matches("[а-яА-Яa-zA-z0-9]{9}", id)){
                return true;
            } else {
                System.out.println("Номер некорректен");
                return false;
            }
        }

        public LocalDate checkDuration(LocalDate validityMonthsPeriod){
            if (LocalDate.now().isAfter((validityMonthsPeriod))){
                System.out.println("Страховка просрочена");
                return LocalDate.now();
            } else {
                return validityMonthsPeriod;
            }
        }

    }

    public Car(String brand, String model, double engineVolume, String color,
               int year, String country, String transmission, String bodyType,
               String registrationNum, int seatsNum, boolean winterRubber) {
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
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color == " ") {
            this.color = "white";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country == " ") {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (transmission == null || transmission == " ") {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType == " ") {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNum == null || registrationNum == " ") {
            this.registrationNum = "default";
        } else {
            this.registrationNum = registrationNum;
        }
        if (seatsNum <= 0) {
            this.seatsNum = 4;
        } else {
            this.seatsNum = seatsNum;
        }
        this.winterRubber = winterRubber;
    }


    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setColor(String color) {
        if (color == null || color == " ") {
            this.color = "white";
        } else {
            this.color = color;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission == " ") {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }

    public void setRegistrationNum(String registrationNum) {
        if (registrationNum == null || registrationNum == " ") {
            this.registrationNum = "default";
        } else {
            this.registrationNum = registrationNum;
        }
    }

    public void setWinterRubber(boolean winterRubber) {
        this.winterRubber = winterRubber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {return transmission;}

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNum() {
        return registrationNum;
    }

    public int getSeatsNum() {
        return seatsNum;
    }

    public boolean isWinterRubber() {
        return winterRubber;
    }


    public void changeRubber(boolean winterRubber) {
        this.winterRubber = !winterRubber;
    }

    public boolean checkRegistrationNum(String number) {
        if (Pattern.matches("[а-я][0-9]{3}[а-я]{2}[0-9]{3}", number)) {
            return true;
        } else{
            return false;
        }
    }


    @Override
    public String toString() {
        return "transport.Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNum='" + registrationNum + '\'' +
                ", seatsNum=" + seatsNum +
                ", winterRubber=" + winterRubber +
                '}';
    }
}
