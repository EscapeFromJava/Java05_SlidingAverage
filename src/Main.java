import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во элементов в массиве");
        int n = scan.nextInt();
        System.out.println("Введите кол-во элементов \"скольжения\"");
        int m = scan.nextInt();
        int[] arr = GetRandomArray(n);
        System.out.println("Исходный массив >> " + Arrays.toString(arr));
        System.out.println("Массив скользищего среднего >> " + Arrays.toString(GetSlidingAverage(arr, m)));
    }

    public static int[] GetRandomArray(int n){
        Random rand = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = rand.nextInt(100);
        return array;
    }

    public static double[] GetSlidingAverage(int[] arr, int m){
        double[] newArr = new double[arr.length - m + 1];
        for (int i = 0; i < arr.length - m + 1; i++)
            newArr[i] = (double)(Arrays.stream(arr, i, i+m).sum() / m);
        return newArr;
    }
}
