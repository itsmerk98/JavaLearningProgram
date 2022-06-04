package inheritance.inherit;

class Bicycle{
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }
    public void ApplyBrack(int brake){
        speed -= brake;
    }
    public void speedUp(int increment){
        speed += increment;
    }
    public String toString(){
        return ("No of gears are " + gear + "\nspeed of bicycle is " + speed);
    }
}

class MountainBike extends Bicycle{
    public int seatHeight;

    public MountainBike(int gear, int speed, int startHeight){
        super(gear, speed);
        seatHeight = startHeight;
    }
    public void setHeight(int newValue){
        seatHeight = newValue;
    }

    @Override public String toString() {
        return (super.toString() + "\nseat height is " + seatHeight);
    }
}

public class inherited{
    public static void main(String[] args){
        MountainBike mb = new MountainBike(3, 100, 32);
        System.out.println(mb.toString());
    }
}