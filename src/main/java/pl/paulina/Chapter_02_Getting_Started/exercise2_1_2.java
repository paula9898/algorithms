package pl.paulina.Chapter_02_Getting_Started;

import java.util.Arrays;

public class exercise2_1_2 {

    public static void main(String[] args) {
        int[] myNum = {5,2,4,6,1,3};

        for(int i = 1; i < myNum.length; i++) {
            int key = myNum[i];
            int j = i -1;

            while(j >= 0 && myNum[j] < key) {
                myNum[j+1] = myNum[j];
                j = j -1;
                myNum[j +1] = key;
                System.out.println(Arrays.toString(myNum));
            }

        }
        System.out.println(Arrays.toString(myNum));
    }

}


