class StaticMethod{
    public static void display1(){
        System.out.println("Static method of outside class");
    }

    public void display2(){
        Method1.display3();
    }
}

public class Method1 {
    public static void main(String[] args) {
        display3();
        StaticMethod.display1();
    }

    public static void display3(){
        System.out.println("A static method/A static variable is called from another static method within the same class directly.");
    }

    public void display4(){
        display3();
    }

}
//? A static method/A static variable is called from another static method within the same class directly.
//? A static method/A static variable is called from another static method outside the class by classname.
//? A static method/A static variable is called from another non-static method within the class directly.
//? A static method/A static variable is called from another non-static method outside the class by classname.