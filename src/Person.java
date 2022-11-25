import java.time.LocalDate;
import java.time.LocalTime;

public class Person {
    private int yearOfBirth;
    private String name;
    private String town;

    private String jobTitle;

    public Person(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth<1900) {
             this.yearOfBirth = LocalDate.now().getYear() - yearOfBirth;
        } else if (yearOfBirth>=1900) {
            this.yearOfBirth = yearOfBirth;
        } else if (yearOfBirth<0) {
            this.yearOfBirth = 0;
        }
        if (name == null || name == " ") {
            System.out.println("Информация не указана");
        } else {
            this.name = name;
        }
        if (town == null || town == " ") {
            System.out.println("Информация не указана");
        } else {
            this.town = town;
        }
        if (jobTitle == null || jobTitle == " ") {
            System.out.println("Информация не указана");
        } else {
            this.jobTitle = jobTitle;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth<1900) {
            this.yearOfBirth = LocalDate.now().getYear() - yearOfBirth;
        } else if (yearOfBirth>=1900) {
            this.yearOfBirth = yearOfBirth;
        } else if (yearOfBirth<0) {
            this.yearOfBirth = 0;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if(town!=null && !town.isBlank() && !town.isEmpty()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + " Будем знакомы!";
    }
}
