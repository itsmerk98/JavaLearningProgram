package inheritance.inherit.singleInheritance;
import java.util.*;

class Inheritances{
    public String fname;
    public int fage;
    public Inheritances(String name, int age){
        this.fname = name;
        this.fage = age;
    }

}
class singleIn extends Inheritances{
    public String name;
    public int age;
    public singleIn(String fname, int fage, String sname, int sage) {
        super(fname, fage);
        this.name = sname;
        this.age = sage;
    }
    
}

public class single extends Object{
    public static void main(String[] args){
        singleIn s = new singleIn("ram",43,"kishor",12);
        System.out.println(s.fname);
    }
}
