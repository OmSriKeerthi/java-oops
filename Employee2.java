public class Employee2 {
    static int id;
    static String name;
    void insertRecord(int m, String n){
        id=m;
        name=n;
    }
    void displayInformation(){
        System.out.println(id+" "+name);
    }
    public static void main(String args[]){
        Employee2 E1=new Employee2();
        E1.insertRecord(111,"Kirtana");
        E1.displayInformation();

    }
}

