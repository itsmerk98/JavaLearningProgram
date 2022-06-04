class bike{
    public int speed = 100;

    public final int breakSpeed(int speed){
        return this.speed -= speed;
    }
}
class MoBike extends bike{
    speed = 29;
    int breakSpeed = breakSpeed(10);

}
class test{
    public static void main(String[] args){
        MoBike mb = new MoBike();
        
        System.out.println("Bike speed : " + mb.speed);  //100
        System.out.println("Break the speed : " + mb.breakSpeed);
        System.out.println("Break the Speed : " + mb.breakSpeed(1));  //0
    }
}