public class Final_variable {
    final int A = 10;
    static final int B;
    final double C;
    static{
        B = 20;
    }
    Final_variable(){
        C = 3.14;
    }
    void display(){
        System.out.println("initialize a final variable when it is declared : " + A);
        System.out.println("initialized inside the constructor : " + C);
        System.out.println("initialized inside a static block : " + B);

    }

    public static void main(String[] args){
        Final_variable f = new Final_variable();
        f.display();        
    }
    
}
