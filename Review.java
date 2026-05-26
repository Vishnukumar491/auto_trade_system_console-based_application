package autotrade;

public class Review {
    seller s;
    buyer b;
    Car c;
    int Rating;
    String description;

    public Review(seller s,buyer b,Car c,int Rating,String description) {
        this.s = s;
        this.b = b;
        this.c = c;
        this.Rating = Rating;
        this.description = description;
    }

    public void display() {
        System.out.printf("%-10s %-10s %-10s %-10d %-20s\n",
                c.car_name, s.name, b.name, Rating, description);
    }
}