import java.sql.SQLOutput;

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

        Car car1 = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Russia"),
                car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany"),
                car3 = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany"),
                car4 = new Car("Kia", "Sportage", 2.4, "red", 2018, "South Korea"),
                car5 = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);





    }
}