public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,10};
        double summa = 0;
        double middle_arifmetical;

        for (int j : array) {
            summa += j;
            System.out.print(j + "|");
        }
        System.out.println();
        middle_arifmetical = summa / array.length;
        System.out.println("Среднее арифметическое : " + middle_arifmetical);
        System.out.println("Сумма элементов массива = " + summa);
    }
}