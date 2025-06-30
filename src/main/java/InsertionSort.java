import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] myNum = {5,2,4,6,1,3};

        for(int i = 1; i < myNum.length; i++) {
            int key = myNum[i];
            int j = i -1;

            while( j >= 0 && myNum[j] > key) {
                myNum[j+1] = myNum[j];
                j = j -1;
                myNum[j + 1] = key;
            }
        }
        System.out.println(Arrays.toString(myNum));
    }
}
