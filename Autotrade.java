package autotrade;
import java.util.*;

public class Autotrade {

    public static List<person> users = new ArrayList<>();
    public static List<Car> show_car = new ArrayList<>();
    public static List<dealing> deals = new ArrayList<>();

    public static void initialize() {
        users.add(new seller("vishnu","123456","madurai","9025102127","vishnu@gmail.com"));
        users.add(new seller("kumar","123456","coimbatore","9025731264","kumar@gmail.com"));
        users.add(new buyer("siva","123456","34567890678","siva@gmail.com","chennai"));
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);
        initialize();

        while(true) {
            System.out.println("\n=========== AUTO TRADE APP ===========");
            System.out.println("1. Login");
            System.out.println("2. Signup");
            System.out.println("======================================");
            System.out.print("Enter choice: ");

            int n = sc.nextInt();

            if(n == 1) {
                System.out.print("\nUsername: ");
                String name = sc.next();

                System.out.print("Password: ");
                String pass = sc.next();

                boolean found = false;

                for(person p : users) {
                    if(p.name.equals(name) && p.pass.equals(pass)) {
                        found = true;
                        System.out.println("\n✅ Login Successful!");
                        p.show_menu(sc, show_car, deals);
                        break;
                    }
                }

                if(!found) {
                    System.out.println("\n❌ Invalid Username or Password");
                }
            }

            else if(n == 2) {
                System.out.println("\n----------- SIGN UP -----------");

                System.out.print("Name      : ");
                String name = sc.next();

                System.out.print("Email     : ");
                String email = sc.next();

                System.out.print("Phone     : ");
                String phone = sc.next();

                System.out.print("Location  : ");
                String location = sc.next();

                System.out.print("Type (seller/buyer): ");
                String type = sc.next();

                System.out.print("Password  : ");
                String pass = sc.next();

                if(type.equalsIgnoreCase("seller")) {
                    users.add(new seller(name, pass, location, phone, email));
                } else {
                    users.add(new buyer(name, pass, phone, email, location));
                }

                System.out.println("\n✅ Signup Successful!");
            }
        }
    }
}