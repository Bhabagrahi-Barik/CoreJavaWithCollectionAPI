class Encapsulation1{
    private int age;
    private String name;

    public Encapsulation1(){
        System.out.println("Constructor called");
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
public class Encapsulations {
    public static void main(String[] args) {
        Encapsulation1 en = new Encapsulation1();
        en.setAge(10);
        en.setName("Farhan");
        System.out.println(en.getAge() + " " + en.getName());

        Encapsulation1 en2 = new Encapsulation1();
        en2.setAge(20);
        en2.setName("Farhan");
        System.out.println(en2.getAge() + " " + en2.getName());
    }
}
