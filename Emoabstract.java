public abstract class Emoabstract {

    abstract void display();

}
class frontend extends Emoabstract{
    void display(){
        System.out.println(111+" "+"keerthi");
    }
}
class designer extends Emoabstract{
    void display(){
        System.out.println(222+" "+"keerthi");
    }
}
class backend extends Emoabstract{
    void display(){
        System.out.println(333+" "+"kirtan");
    }
}

class Abstraction{
    public static void main(String args[]){
        Emoabstract e1=new backend();
        e1.display();
    }
}
