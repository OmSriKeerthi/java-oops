public class Empencap {
    private int emp_id;
    private String emp_name;
    private float salary;

    public int getemp_id() {
        return emp_id;
    }


    public void setemp_id(int emp_id){
        this.emp_id=emp_id;
    }
    public String getemp_name(){
        return emp_name;
    }
    public void setemp_name(String emp_name){
        this.emp_name=emp_name;
    }
    public float getsalary(){
        return salary;
    }
    public void setsalary(float salary){
        this.salary=salary;
    }

}
class TestEncapsulation {
    public static void main(String args[]) {
        Empencap e1 = new Empencap();
        e1.setemp_id(111);
        e1.setemp_name("keerthi");
        e1.setsalary(50000);
        System.out.println(e1.getemp_id() + e1.getemp_name() + " " + e1.getsalary());
    }
}


