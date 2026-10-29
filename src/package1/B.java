package package1;

public class B {
    public void display2(){
        System.out.println("Public: "+A.a);
        System.out.println("Default: "+A.b);
        System.out.println("Protected: "+A.c);
//        System.out.println("Private: "+A.d);
    }
}
