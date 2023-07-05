/*Реализуйте метод, принимающий в качестве аргументов два целочисленных
массива, и возвращающий новый массив, каждый элемент которого равен
разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить
пользователя. */

import java.util.Arrays;

public class Lesson1_3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 2};
        int[] array2 = {4, 2, 1};
        try {
            int [] result = calcDiffArrays(array1, array2);
            System.out.println(Arrays.toString(result));
        } catch (IllegalArgumentException e) {
            System.out.println("Длины массивов не совпадают");
        } 

        
    }
    public static int [] calcDiffArrays(int[]arr1,int[]arr2){
        if(arr1.length!= arr2.length){
            throw new IllegalArgumentException("Длины массивов не совпадают");
        }
        int[]newarr = new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            newarr[i] = arr1[i] - arr2[i];
        }
        return newarr;
    }
}
