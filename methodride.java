class methodride {

    void display()
    {
        System.out.println("display() method of base class");
        System.out.println("Displaying details");
    }
}

class Employe extends methodride {

    void display()
    {
        System.out.println("display() method of derived class");
        System.out.println("Employee detail is displayed");
    }
}

class MethodOverriding {

    public static void main(String args[])
    {
        Employe e1 = new Employe();
         methodride a1 = new methodride();

        e1.display();
        a1.display();

        methodride riding = new Employe();
        // eat() method of animal class is overridden by
        // base class eat()
        riding.display();
    }
}
