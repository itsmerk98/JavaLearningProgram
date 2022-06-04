package inheritance;
class Room{
    int lenght,height;
    Room(int x, int y){
        this.lenght = x;
        this.height = y;
    }
    int area(){
        return (lenght*height);
    }
}
class BedRoom extends Room{
    int width;
    BedRoom(int a,int b, int c){
        super(a,b);
        width=c;
    }
    int display(){
        return lenght*height*width;
    }
}
public class inherite {
    public static void main(String[] args){
        BedRoom R1 = new BedRoom(10,20,30);
        System.out.println(R1.area());
    }
}
