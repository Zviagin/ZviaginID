package first;

public class Main {
    static final int  COUNT_ROW = 5;
    static int COUNT_COL = 3;

    public static void main(String[] args) {

        int[][] myList = new int[COUNT_ROW][COUNT_COL];
        for (int i = 0; i < myList.length; i++) {
            for (int j = 0; j < myList[i].length; j++) {
                myList[i][j] = (int) Math.round((Math.random() * 30) + 1);
            }
        }

        // Вывести на экран все элементы массива
        for (int i = 0; i < myList.length; i++) {
            for (int j = 0; j < myList[i].length; j++) {
                System.out.print(myList[i][j] + " ");
            }
            System.out.println();
        }
        // Сумма элементов массива
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            for (int j = 0; j < myList[i].length; j++) {
                total += myList[i][j];
            }
        }

        System.out.println("Сумма чисел массива: " + total);
        // Нахождение среди элементов массива наибольшего
        double max = myList[0][0];
        for (int i = 0; i < myList.length; i++) {
            for (int j = 1; j < myList[i].length; j++) {
                if (myList[i][j] > max) max = myList[i][j];
            }
        }
        System.out.println("Наибольший элемент: " + max);

        double min = myList[0][0];
        for (int i = 0; i < myList.length; i++) {
            for (int j = 1; j < myList[i].length; j++) {
                if (myList[i][j] < min) min = myList[i][j];
            }
        }
        System.out.println("Наименьший элемент: " + min);
    }
}
