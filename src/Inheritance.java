//?================================ SINGLE INHERITANCE(ONE PARENT HAS ONE CHILD) =============================================

//class Parent2{
//    public void display1(){
//        System.out.println("Parent's display");
//    }
//}
//class Child1 extends Parent2{
//    public void display2(){
//        System.out.println("Child's display");
//    }
//}
//
//public class Inheritance {
//    public static void main(String[] args) {
//        Child1 child = new Child1();
//        child.display1();
//        child.display2();
//    }
//}


//?================================ MULTILEVEL INHERITANCE(GRANDPARENT HAS A CHILD WHICH ACT AS A PARENT FOR IT'S CHILD) =============================================

class Parent2{
    public void display1(){
        System.out.println("GrandParent's display");
    }
}
class Child1 extends Parent2{
    public void display2(){
        System.out.println("Parent's display");
    }
}
class Child2 extends Child1{
    public void display3(){
        System.out.println("Child's display");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Child2 child = new Child2();
        child.display1();
        child.display2();
        child.display3();
    }
}
 //? Java not support multiple inheritance in class level because multiple inheritance means one child has two parents. If both the parents has different method then good we can access any of them through child , but if both parent has same method, then while accessing it through child compiler get confused which parent's method to call between the two. This arises a diamond problem. So to avoid this Java not support multiple inheritance through class level, but it supports multiple inheritance through interface level.
//? There are two other inheritance in java 1) Hierarchical inheritance (one parent has multiple children) and 2) Hybrid inheritance(combination of two or more type of inheritance)