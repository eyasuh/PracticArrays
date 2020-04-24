import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PracticeArrays {
    public static void main (String [] args ) {
        //1 Create an array to hold the numbers 1-10.
        int [] intArr = {1,2,3,4,5,6,7,8,9,10};
        //2
        for (int i = 1; i < 10; i++) {
            intArr[0] += intArr[i];
        }
        System.out.println(intArr[0]);
        //3
        Scanner in = new Scanner(System.in);
        System.out.println("put 10 numbers in");
        for (int i = 0; i < 10; i++) {
            intArr[i] = in.nextInt();
            in.nextLine();
        }
        for (int i = 1; i < 10; i++) {
            intArr[0] += intArr[i];
        }
        System.out.println(intArr[0]);
        //4
        int avg = intArr[0]/10;
        System.out.println("average " + avg);
        //5
        String [] nameArr = {"bob", "mary", "kat"};
        for (int i = 0; i < 3; i++) {
            System.out.print(nameArr[i] + " ");
        }
        System.out.println("");
        //6
        int [] intArr2 = {2,5,9,0,2,1,8,5,4};
        for (int i = 0; i < 9; i++) {
            if(intArr2[i] == 5)
                System.out.print(i + " ");
        }
        // 7
        int [] intArr3 = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 9; i >= 0; i--) {
            System.out.print(intArr3[i] + "");
        }
        System.out.print("\n");
        //8
        String [] strArr = {"w",   "t",  "y",  "h",  "k"};
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("t"))
                strArr[i] = "hello";

        }
        System.out.println(Arrays.toString(strArr));
        //9
        int [] arr1 = {1,7,6,5,9};
        int [] arr2 = {2,7,6,3,4};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j])
                    System.out.println("(" + arr1[i] + "," + arr2[j] + ")");
            }
        }




    }
}
