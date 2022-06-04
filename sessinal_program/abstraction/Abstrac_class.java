abstract class Abstc{
    static int a = 0;
    Abstc(){

    }
    abstract void display();
    
    void print(){
        System.out.println("hello ");
    }
}

public class Abstrac_class extends Abstc {

    void display(){
        System.out.println("Abstract method called.");
    }

    void print(){
        System.out.println("Method override ;");
    }
    public static void main(String[] args){
        
        Abstrac_class a = new Abstrac_class();
        a.display();
        a.print();
    }
}
