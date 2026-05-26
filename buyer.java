package autotrade;
import java.util.*;

public class buyer extends person {

    public buyer(String name,String pass,String phone,String email,String location) {
        this.name = name;
        this.pass = pass;
        this.phone = phone;
        this.email = email;
        this.location = location;
    }

    public void show_menu(Scanner sc,List<Car> show_car,List<dealing> deals) {

        while(true) {
            System.out.println("\n=========== BUYER MENU ===========");
            System.out.println("1. View Cars");
            System.out.println("2. Buy Car");
            System.out.println("3. My Orders");
            System.out.println("4. View History");
            System.out.println("5. Logout");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            if(ch == 1) {
                System.out.printf("%-5s %-15s %-6s %-10s %-12s %-12s\n",
                        "ID","Name","Year","Amount","Type","Seller");

                for(Car c:show_car)
                    c.display();
            }

            else if(ch == 2) {
                System.out.print("Enter Car ID: ");
                int id = sc.nextInt();

                for(Car c:show_car) {
                    if(c.id == id) {
                        System.out.print("Payment Status: ");
                        String st = sc.next();

                        dealing d = new dealing(c.s,c,this,c.Amount,st);
                        deals.add(d);
                        d.make_review(sc);

                        System.out.println("✅ Purchased");
                    }
                }
            }

            else if(ch == 3) {
                System.out.printf("%-10s %-10s %-10s %-10s %-15s\n",
                        "Seller","Car","Buyer","Amount","Payment");

                for(dealing d:deals) {
                    if(d.b == this)
                        d.display();
                }
            }

            else if(ch == 4) {
                System.out.print("Enter Car ID: ");
                int id = sc.nextInt();

                for(Car c:show_car) {
                    if(c.id == id) {
                        if(c.h != null)
                            c.h.display();
                        else
                            System.out.println("No History");
                    }
                }
            }

            else if(ch == 5) {
                break;
            }
        }
    }
}