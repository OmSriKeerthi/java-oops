class methodload {

    static int emp_id(int a, int b)
    {
        return a + b;
    }

    static int emp_id(int a, int b,int c)
    {
        return a + b + c;
    }

    public static void main(String args[])
    {
        System.out.println("emp_id with 2 parameters");
        System.out.println(emp_id(4, 6));

        System.out.println("emp_id with 3 parameters");
        System.out.println(emp_id(4, 6, 7));
    }
}
