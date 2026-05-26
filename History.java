package autotrade;

public class History {
    int No_of_previous_users;
    int no_of_Acciendents;
    String description;
    int no_of_km_runned;
    Car c;

    public History(int p,int a,int km,String desc,Car c) {
        this.No_of_previous_users = p;
        this.no_of_Acciendents = a;
        this.description = desc;
        this.no_of_km_runned = km;
        this.c = c;
    }

    public void display() {
        System.out.printf("%-5d %-10d %-10d %-10d %-20s\n",
                c.id, No_of_previous_users, no_of_Acciendents,
                no_of_km_runned, description);
    }
}