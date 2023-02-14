class Employeecon{
    int id;
    String name;
    float salary;
    //creating a parameterized constructor
    Employeecon(int i,String n,float s){
        id = i;
        name = n;
        salary = s;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }

    public static void main(String args[]){
        //creating objects and passing values
        Employeecon E1 = new Employeecon(111,"kirtana",29000);
        Employeecon E2 = new Employeecon(222,"keerthi",30000);
        //calling method to display the values of object

        E1.display();
        E2.display();
    }
}

