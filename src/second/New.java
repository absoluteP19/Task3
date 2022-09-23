package second;
import java.util.Scanner;
public class New {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size_of_array;
        double summa = 0;
        double average;
        System.out.println("Enter size of array");
        size_of_array = scanner.nextInt();
        int[] array = new int[size_of_array];
        System.out.println("Enter numbers in array");
        for(int i = 0; i < array.length; i++){
            System.out.println("Число " + (i + 1)  + " " + "из " + array.length + ":");
            int number_to_array = scanner.nextInt();
            summa += number_to_array;
            array[i] = number_to_array;
        }
        for(int i : array){
            System.out.print(i + "|");
        }
        average = summa / array.length;
        System.out.println("Сумма элементов массива = " + summa);
        System.out.println("Среднее арифметическое = " + average);
    }
}
