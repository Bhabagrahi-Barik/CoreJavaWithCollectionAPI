class Animal{
    public void show(){
        System.out.println("This is Animal class.");
    }
}
class Cat extends Animal{
    public void show(){
        System.out.println("This is cat class.");
    }
}
class Dog extends Animal{
    public void show(){
        System.out.println("This is dog class.");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.show();
    }
}

//? Method overloading is the process where methods name are same but parameters are differ basing on the no. of parameters, type of parameters, and order of parameters. It is known as Early binding or Static polymorphism.

//? Method overriding is the process where we have to override the parent class method in a child class if we don't want the parent class logic. In method overriding we have to use "@override" annotation to overcome the signature mismatch. Also, it is known as Runtime polymorphism or Late binding, because which method to call is decided by the jvm after the object creation at runtime .
