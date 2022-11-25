import transport.Car;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(1988, "Максим", "Минск", "бренд-менеджер"),
                person2 = new Person(1993,"Аня", "Москва", "методист образовательных программ"),
                person3 = new Person(1992, "Катя", "Калининград", "продакт-менеджер"),
                person4 = new Person(1995, "Артем", "Москва", "директор по развитию бизнеса");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);

        //

        Car car1 = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Russia", null, null, null,
                4, false),
                car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany", null, null, null,
                        4, false),
                car3 = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany", null, null, null,
                        4, false),
                car4 = new Car("Kia", "Sportage", 2.4, "red", 2018, "South Korea", null, null, null,
                        4, false),
                car5 = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea", null, null, "x456or457",
                        4, false);


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        Person person5 = new Person(21, "Владимир", "Казань", null);

        //

        Flower flower1 = new Flower("Rose", "Netherlands", 35.59),
                flower2 = new Flower("chrysanthemum", null, 15, 5),
                flower3 = new Flower("peony", "England", 69.9, 1),
                flower4 = new Flower("gypsophila", "Turkey", 19.5, 10);

        System.out.println(flower1);
        System.out.println(flower2);
        System.out.println(flower3);
        System.out.println(flower4);

        car5.changeRubber(car5.isWinterRubber());
        System.out.println(car5);
        System.out.println(car5.checkRegistrationNum(car5.getRegistrationNum()));





    }
}