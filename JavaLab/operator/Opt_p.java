package operator;
// import java.util.*;

public class Opt_p {
    public static void main(String[] args){
       int a = 10;
       int pos = 2;
       int bitMask = 1<<pos;
    //    printAddressing(a);
    //    System.out.println(a.equals(pos)); 
    //    b = --a;
    //    System.out.println(a);
    //    System.out.println(b);
    
        if((bitMask & a) == 0) 
            System.out.println(true);
        else
            System.err.println(false);
    }    
}
