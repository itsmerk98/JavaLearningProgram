class Test{
    static int a = 10;
    static int b = 11;

    static int display(){
        return a + b;
    }
}
class Static_variable {

    public static void main(String[] args){
        // static variable access by the class name not a object  as Test.a ,Test.b and Test.display();
        // Test t = new Test();
        // System.out.println("Obkect value : " + t.a);
        System.out.println("Value of variable a : " + Test.a);
        System.out.println("Value of variable b : " + Test.b);

        System.out.println("Value of variable display : " + Test.display());
    }
}
