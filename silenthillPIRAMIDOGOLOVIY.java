public class silenthillPIRAMIDOGOLOVIY {
    public static void main(String[] args) {

        int[][] pyramid = {
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };

        System.out.println("обычный вид:");
        printPyramid(pyramid);

        System.out.println("\nобратный порядок:");
        printPyramidReverse(pyramid);
    }


    public static void printPyramid(int[][] pyramid) {
        for (int[] row : pyramid) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void printPyramidReverse(int[][] pyramid) {
        for (int i = pyramid.length - 1; i >= 0; i--) {
            for (int num : pyramid[i]) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
