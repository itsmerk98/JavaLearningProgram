package constructor_overloading;
public class Room {
    Room(int height) {
        lenght = width = height;
    }
    Room(int height, int len) {
        lenght = height;
        width = len;
    }
     String toString(Room room) {
        return width + " " + lenght;
    }
}
// public class constructor_overloading {
//     public static void main(String[] args){
//         Room r1 = new Room(10);
//         System.out.println("Output is = " + r1.toString());
//     }
// }
