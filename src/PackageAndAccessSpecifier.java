import package2.C;
import package2.D;
import package1.A;
import package1.B;

public class PackageAndAccessSpecifier {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("Within the same class in the same package");
        a.display();
        System.out.println();

        B b = new B();
        System.out.println("Within a different class in the same package");
        b.display2();
        System.out.println();

        C c = new C();
        System.out.println("Within a different class in the different package");
        c.display3();
        System.out.println();

        D d = new D();
        System.out.println("Within a subclass in the different package");
        d.display3();
    }
}
