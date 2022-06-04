package Super;
class Super{
    int x;
    public Super(int x) {
        this.x = x;
    }
    public void display(){
        System.out.println("Super X : " + x);
    }
}
class Sub extends Super{
    int y;
    public Sub(int x, int y) {
        super(x);
        this.y = y;
    }
    public void display() {
        display();
        System.out.println("Super x : " + x);
        System.out.println("Sub Y : " + y);
    }
}
public class SuperClass {
    public static void main(String[] args) {
        Sub sub1 = new Sub(10,20);
        sub1.display();
    }
}
