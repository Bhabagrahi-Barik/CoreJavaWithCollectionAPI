package package1;

public class A {
    public static int a = 10;
    static int b = 20;
    protected static int c = 30;
    private static final int d = 40;

    public void display(){
        System.out.println("Public: "+a);
        System.out.println("Default: "+b);
        System.out.println("Protected: "+c);
        System.out.println("Private: "+d);
    }
}

