package autotrade;
import java.util.*;

public class seller extends person {

    public seller(String name,String pass,String location,String phone,String email) {
        this.name = name;
        this.pass = pass;
        this.location = location;
        this.phone = phone;
        this.email = email;
    }

    public void show_menu(Scanner sc,List<Car> show_car,List<dealing> deals) {

        while(true) {
            System.out.println("\n=========== SELLER MENU ===========");
            System.out.println("1. Add Car");
            System.out.println("2. View Ratings");
            System.out.println("3. View Orders");
            System.out.println("4. View Sold Cars");
            System.out.println("5. Add History");
            System.out.println("6. Logout");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if(choice == 1) {
                System.out.print("Car Name: ");
                String name = sc.next();

                System.out.print("Amount: ");
                int amount = sc.nextInt();

                System.out.print("Year: ");
                int year = sc.nextInt();

                System.out.print("Type: ");
                String type = sc.next();

                show_car.add(new Car(show_car.size()+1,name,year,amount,this,type));
                System.out.println("✅ Car Added");
            }

            else if(choice == 2) {
                System.out.printf("%-10s %-10s %-10s %-10s %-20s\n",
                        "Car","Seller","Buyer","Rating","Description");

                for(dealing d:deals) {
                    if(d.r != null && d.s == this)
                        d.r.display();
                }
            }

            else if(choice == 3) {
                System.out.printf("%-10s %-10s %-10s %-10s %-15s\n",
                        "Seller","Car","Buyer","Amount","Payment");

                for(dealing d:deals) {
                    if(d.s == this)
                        d.display();
                }
            }

            else if(choice == 4) {
                System.out.printf("%-5s %-15s %-15s %-10s\n",
                        "ID","Car","Buyer","Amount");

                for(dealing d:deals) {
                    if(d.s == this)
                        System.out.printf("%-5d %-15s %-15s %-10d\n",
                                d.c.id,d.c.car_name,d.b.name,d.Amount);
                }
            }

            else if(choice == 5) {
                System.out.print("Enter Car ID: ");
                int id = sc.nextInt();

                Car c1 = null;
                for(Car c:show_car)
                    if(c.id == id) c1 = c;

                if(c1 == null) {
                    System.out.println("❌ Invalid ID");
                    continue;
                }

                System.out.print("Owners: ");
                int p = sc.nextInt();

                System.out.print("Accidents: ");
                int a = sc.nextInt();

                System.out.print("KM: ");
                int km = sc.nextInt();

                sc.nextLine();
                System.out.print("Description: ");
                String desc = sc.nextLine();

                c1.h = new History(p,a,km,desc,c1);
                System.out.println("✅ History Added");
            }

            else if(choice == 6) {
                break;
            }
        }
    }
}