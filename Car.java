package autotrade;

public class Car {
    int id;
    String car_name;
    int year;
    int Amount;
    String Vehicle_type;
    seller s;
    History h;

    public Car(int id,String car_name,int year,int Amount,seller s,String Vehicle_type) {
        this.id = id;
        this.car_name = car_name;
        this.year = year;
        this.Amount = Amount;
        this.s = s;
        this.Vehicle_type = Vehicle_type;
    }

    public void display() {
        System.out.printf("%-5d %-15s %-6d %-10d %-12s %-12s\n",
                id, car_name, year, Amount, Vehicle_type, s.name);
    }
}