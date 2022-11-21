public class Person {
    private int yearOfBirth;
    private String name;
    private String town;

    private String jobTitle;

    public Person(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth>0) {
            this.yearOfBirth = yearOfBirth;
        } else {
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

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + " Будем знакомы!";
    }
}
