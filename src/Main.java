
public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello World!");

//        byte b = 23;
//        System.out.println("byte: " + b);
//
//        char c = 'a';
//        System.out.println("char: " + c);
//
//        short s = 23;
//        System.out.println("short: " + s);
//
//        int i = 23;
//        System.out.println("int: " + i);
//
//        float f = 23.3f;
//        System.out.println("float: " + f);
//
//        double d = 23.3;
//        System.out.println("double: " + d);
//
//        long l = 23L;
//        System.out.println("long: " + l);
//
//        boolean bool = true;
//        System.out.println("boolean: " + bool);

//?===================== ARITHMATIC OPERATORS===========================
        System.out.println(2+3);
        System.out.println(2-3);
        System.out.println(2*3);
        System.out.println(2/3);
        System.out.println(2%3);

        int k = 3;
        System.out.println(k++); // 3
        System.out.println(k); // 4
        System.out.println(--k); // 3
        System.out.println(k); // 3
        System.out.println(++k); // 4
        System.out.println(k); // 4
        System.out.println(k--);// 4
        System.out.println(k); // 3

//?===================== RELATIONAL/COMPARISON OPERATORS===========================
        System.out.println(2>3);
        System.out.println(2<3);
        System.out.println(2>=3);
        System.out.println(2<=3);
        System.out.println(2==3);
        System.out.println(2!=3);

//?===================== ASSIGNMENT OPERATORS===========================
        int j = 10;
        System.out.println(j+=3);
        System.out.println(j-=3);
        System.out.println(j*=3);
        System.out.println(j/=3);

//?===================== LOGICAL OPERATORS===========================
        int m = 3, n = 2, d = 19, f = 30;
        System.out.println((m>n) && (d<f));
        System.out.println((m>n) || (d<f));
        System.out.println((m>n) & (d<f));
        System.out.println((m>n) | (d<f));
        System.out.println((m>n) ^ (d<f));
        System.out.println(!(m>n));

//?===================== TERNARY OPERATORS===========================
        boolean b = true;
        String result = (b == true) ? "Hii" : "Hello";
        System.out.println(result);
    }
}