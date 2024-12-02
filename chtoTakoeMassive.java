import java.util.Random;

public class chtoTakoeMassive {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        double[][] array = new double[rows][cols];
        double[][] modifiedArray = new double[rows][cols];

        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextDouble() * 10;
                modifiedArray[i][j] = array[i][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i % 2 != 0 || j % 2 != 0) {
                    modifiedArray[i][j] = Math.sqrt(array[i][j]);
                }
            }
        }

        System.out.println("Оригинальний массив:");
        printArray(array);

        System.out.println("\nМодифицированый массив:");
        printArray(modifiedArray);
    }

    public static void printArray(double[][] array) {
        for (double[] row : array) {
            for (double value : row) {
                System.out.printf("%.2f ", value);
            }
            System.out.println();
        }
    }
}
