package Practice.Ex10.Matrix;

public class Matrix {
    public static void main(String[] args) {
        int[][] twoDimArray1 = {{1, 0}, {0, 1}};
        int[][] twoDimArray2 = {{1, 2}, {1, 1}};

        // Сумма матриц
        int[][] sumArray = new int[twoDimArray1.length][twoDimArray1[0].length];
        for (int i = 0; i < twoDimArray1.length; i++) {
            for (int j = 0; j < twoDimArray1[0].length; j++) {
                sumArray[i][j] = twoDimArray1[i][j] + twoDimArray2[i][j];
            }
        }

        // Вывод на экран суммы матриц
        System.out.println("Сумма матриц:");
        printArray(sumArray);

        // Разность матриц
        int[][] diffArray = new int[twoDimArray1.length][twoDimArray1[0].length];
        for (int i = 0; i < twoDimArray1.length; i++) {
            for (int j = 0; j < twoDimArray1[0].length; j++) {
                diffArray[i][j] = twoDimArray1[i][j] - twoDimArray2[i][j];
            }
        }

        // Вывод на экран разности матриц
        System.out.println("Разность матриц:");
        printArray(diffArray);

        // Произведение матриц
        int[][] prodArray = new int[twoDimArray1.length][twoDimArray2[0].length];
        for (int i = 0; i < twoDimArray1.length; i++) {
            for (int j = 0; j < twoDimArray2[0].length; j++) {
                for (int k = 0; k < twoDimArray1[0].length; k++) {
                    prodArray[i][j] += twoDimArray1[i][k] * twoDimArray2[k][j];
                }
            }
        }

        // Вывод на экран произведения матриц
        System.out.println("Произведение матриц:");
        printArray(prodArray);
    }

    // Метод для вывода двумерного массива на экран
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
