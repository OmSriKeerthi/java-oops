public class Empinherit {
    int emp_id=111;
    float salary=20000;
}
class programmer extends Empinherit {
    int pf = 100000;



        public static void main(String args[]) {
            programmer p = new programmer();

            System.out.println("programmer id is" + " " + p.emp_id);
            System.out.println("programmer salary is" +" "+ p.salary);
            System.out.println("pf of programmer is" + " "+p.pf);


    }
}
