public class Flower {
    private String name;
    private String country;
    private double cost;
    int lifeSpan;


    public Flower(String name, String country, double cost) {
        this.name =  name != null && !name.isEmpty() && !name.isBlank() ? name : "White";
        this.country =  country != null && !country.isEmpty() && !country.isBlank() ? country : "Russia";
        this.cost =  cost >= 0 ? cost : 1;
    }
    public Flower(String name, String country, double cost, int lifeSpan) {
        this(name, country, cost);
        this.lifeSpan = lifeSpan == 0 ? 3 : lifeSpan;
        
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan == 0 ? 3 : lifeSpan;
    }

    public String getName() { return name; }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }



    @Override
    public String toString() {
        return "Flower{" +
                "flowerColor='" + name + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", lifeSpan=" + lifeSpan +
                '}';
    }



}
