class NonStaticMethod {
    public static void method3(){
        new Method2().method2();
    }

    public void method4(){
        new Method2().method1();
    }
}

public class Method2 {
    public static void main(String[] args) {
        new Method2().method1();
    }

    public void method1(){
        System.out.println("Hello World");
    }

    public void method2(){
        method1();
    }
}
//? A non-static method/A non-static variable is called from another static method within the same class by object.
//? A non-static method/A non-static variable is called from another static method outside the class by object.
//? A non-static method/A non-static variable is called from another non-static method within the same class directly.
//? A non-static method/A non-static variable is called from another non-static method outside the class by object.