package autotrade;
import java.util.*;

abstract public class person {
    String name;
    String pass;
    String email;
    String location;
    String phone;

    abstract void show_menu(Scanner sc, List<Car> show_car, List<dealing> deals);
}