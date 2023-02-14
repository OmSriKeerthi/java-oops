class Emppoly {
    static int emp_id(int a, int b)
    {
        return a + b;
    }
    static String emp_name(String a, String b)
    {
        return a + " " + b;
    }
    static float salary(float a,float b){
        return a + b;
    }
}
class TestPolymorphism {
    public static void main(String[] args)
    {
        System.out.println(Emppoly.emp_id(2, 4));
        System.out.println(Emppoly.emp_name("Keerthi", "kirtana"));
        System.out.println(Emppoly.salary(40000,30000));
    }
}