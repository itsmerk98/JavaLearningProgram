package inter_face;
interface Test{
    void p1();
    // abstract void p2();
}
interface sample extends Test{
    final int a = 10;
     void p1();
     interface p{
         void p2();
     }
}
public class Interfaces implements Test , sample {
    
    public void p1(){
        System.out.println("hello ");
    }
    public void p2(){
        System.out.println("Nested interface ");
    }
    public static void main(String[] args) {
        Test p = new Interfaces();
        Interfaces n = new Interfaces();
        System.out.println(n.a);
        n.p1();
        n.p2();
    }
}
