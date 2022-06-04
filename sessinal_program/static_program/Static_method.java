class Static_method {
    static int a;
    int b;
    
    
    static String d(){
        String ch = "hello";
        return ch;
    }
    
    static void display(int d, int e) {
        a = d;
        String ch = d();
        System.out.println("Static method called");
    }

    
    public static void main(String[] args){
        display(10,20);
    }
}