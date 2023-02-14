public class Employeetest {
    int id;
    String name;
    float salary;
    void insert(int i, String n, float s) {
        id=i;
        name=n;
        salary=s;
    }
    void display(){System.out.println(id+" "+name+" "+salary);}


    public static void main(String[] args) {
        Employeetest e1=new Employeetest();
        Employeetest e2=new Employeetest();
        Employeetest e3=new Employeetest();
        e1.insert(101,"keerthi",45000);
        e2.insert(102,"kirtana",25000);
        e3.insert(103,"vinusha",55000);
        e1.display();
        e2.display();
        e3.display();
    }
}

