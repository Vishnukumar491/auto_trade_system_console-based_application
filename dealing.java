package autotrade;
import java.util.*;

public class dealing {
    seller s;
    Car c;
    buyer b;
    int Amount;
    String payment_status;
    Review r;

    public dealing(seller s,Car c,buyer b,int Amount,String payment_status) {
        this.s = s;
        this.c = c;
        this.b = b;
        this.Amount = Amount;
        this.payment_status = payment_status;
    }

    public void make_review(Scanner sc) {
        System.out.print("Rating: ");
        int rating = sc.nextInt();

        System.out.print("Description: ");
        sc.nextLine();
        String desc = sc.nextLine();

        r = new Review(s,b,c,rating,desc);
    }

    public void display() {
        System.out.printf("%-10s %-10s %-10s %-10d %-15s\n",
                s.name, c.car_name, b.name, Amount, payment_status);
    }
}