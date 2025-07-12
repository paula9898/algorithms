package pl.paulina.Chapter_02_Getting_Started;

public class exercise2_1_3 {

    public static void main(String[] args) {

        int[] myNum = {5,2,4,6,1,3};
        int result = linearSearch(myNum, 34);
        System.out.println(result);
    }

    private static int linearSearch(int[] myArray,int v) {

        for(int i = 0; i < myArray.length; i++) {
            if( v == myArray[i]){
                return i;
            }
        }
        return -1;
    }
}
