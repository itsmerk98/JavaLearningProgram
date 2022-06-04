package interface01;

interface I1{
    static float pi = 3.14f;
    float area(float i);

}
class beta implements I1{

    public float area(float i){
        return (pi*i*i);
    }
}

public class Test {
    public static void main(String[] args) {
        beta b = new beta();
        System.out.println(b.area(3));
    }
}
