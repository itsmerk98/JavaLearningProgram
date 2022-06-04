package methods;
class sample{
    int add(int a, int b){
        return a + b;
    }
    double add(double a, double b){
        return a + b;
    }
}
public class method {
    public static void main(String[] args){
        int a; 
        double b;
        sample s1 = new sample();
        a = s1.add(10,20);
        b = s1.add(10.20,20.50);
        System.out.println("First method int = " + a);
        System.out.println("Second method double = " + b);
    }
}
