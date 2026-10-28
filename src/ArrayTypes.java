public class ArrayTypes {
    public static void main(String[] args) {

//? ==================== ID ARRAY ==============================================

//        int[] arr = new int[10];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int)(Math.random() * 30) ;
//        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }

//        for(int k:arr){
//            System.out.print(k+" ");
//        }

//? ==================== 2D ARRAY ================================================

//        int[][] arr = new int[3][4];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = (int)(Math.random() * 100);
//            }
//        }
//
//        for(int[] k : arr){
//            for (int s : k){
//                System.out.print(s+" ");
//            }
//            System.out.println();
//        }

//? ====================== 3D ARRAY ==============================================

//        int[][][] arr = new int[3][4][5];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                for (int k = 0; k < arr[i][j].length; k++) {
//                    arr[i][j][k] = (int)(Math.random() * 100);
//                }
//            }
//        }
//
//        for(int[][] m:arr){
//            for(int[] n:m){
//                for(int o:n){
//                    System.out.print(o+" ");
//                }
//                System.out.println();
//            }
//            System.out.println("-----------------------------------");
//        }

//? ============================ Jagged Array ===================================

        int[][] arr = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random() * 100);
            }
        }

        for(int[] s : arr ){
            for(int i : s){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
//? In 3D ARRAY each array has the three dimensions ([block/layer][row][column].
//? In Jagged Array during declaration time the no. of columns are not specified in the same lin.