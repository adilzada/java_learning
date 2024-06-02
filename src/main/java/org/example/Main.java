package org.example;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//        String [] array2 = new String[5];
//String [] array1 = new String[5];
//int x;
//for(x=0;x<array1.length;x++) {
//    Scanner sc = new Scanner(System.in);
//    array1[x] = sc.next();
//}
//        System.out.println(Arrays.toString(array1));
//
//        for (int i = 0; i < array1.length; i++) {
//            array2[i] = array1[array1.length - i - 1];
//        }
//            System.out.println("reverse array ");
//        System.out.println(Arrays.toString(array2));




String [] array2 = new String[5];
String [] array1 = new String[5];
int x;
int y;
for(x=0;x<array1.length;x++) {
    Scanner sc = new Scanner(System.in);
    array1[x] = sc.next();
}
        System.out.println(Arrays.toString(array1));

        for(x=0;x< array1.length;x++){
    for ( y = array2.length-x-1; y >=0; y--) {

        array2[y]=array1[x];
    }
}
        System.out.println("reverse array:");
        System.out.println(Arrays.toString(array2));






//            int [] array={21,32,33,56,76};
//
//    for(int i=0;i<array.length ; i++ ) {
//        Scanner input = new Scanner(System.in);
//        array[i] = input.nextInt();
//    }
//        for(int i=0;i<array.length;i++) {
//            System.out.print(array[i]+", ");
//        }






//        for (int i = 1; i <= 6; i++) {
//            // Hər satır üçün boşluqları yazdır
//            for (int j = 6; j > i; j--) {
//                System.out.print(" ");
//            }
//            // ulduzları yazsın
//            for (int j = 1; j <= (2 * i - 1); j++) {
//                System.out.print("*");
//            }
//            // Yeni bir setire keç
//            System.out.println();
//        }
//        // Gövdəni çap et
//        for (int i = 1; i < 6; i++) {
//            System.out.print(" ");
//        }
//        System.out.println("*");
        }}
