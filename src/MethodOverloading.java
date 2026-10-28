public class MethodOverloading {
    public void add(int a, int b){
        System.out.println(a+b);
    }

    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public void add(float a, int b){
        System.out.println(a+b);
    }

    public void add(int a, float b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.add(1,2);
        mo.add(1,2,3);
        mo.add(1.2f, 3);
        mo.add(4, 1.4f);
    }
}
//? Known as static binding or early binding, as compiler decides which method to call at compile time(or we can say compiler decides binding).