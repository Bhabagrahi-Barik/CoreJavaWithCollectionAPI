public class Array {
    public static void main(String[] args) {
//        int[] arr = new int[2];
//        arr[0] = 1;
//        arr[1] = 2;
//        System.out.println(arr[0]);
//
//        arr[1] = 13;
//        System.out.println(arr[1]);

        String[] arr2 = {"Harry", "Peeter", "Marry", "Manoj", "Akash"};
        System.out.println(arr2.length);
        System.out.println(arr2[0]);


        Array objOfMyClass = new Array();
        System.out.println(objOfMyClass);

    }

    @Override
    public String toString(){
        return "This is overridden method";
    }
}
//? ==========Array declaration and initialization in java and js=================
/*
                                IN JAVA
            int[] arr = {1, 2, 3};

            int[] arr2 = new int[4];
            arr2[0] = 1;
            arr2[1] = 2;
                                IN JS
            const arr = [1, 2, 3];
            const arr = new Array(1, 2, 3);
*/