import java.util.Scanner;

public class AppReverseHorizontally {

    public static int[][] reverseHorizontally(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] reversed = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                reversed[i][j] = matrix[i][cols - 1 - j];
            }
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadejte počet řádků: ");
        int rows = scanner.nextInt();
        System.out.print("Zadejte počet sloupců: ");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Zadejte prvky matice:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int[][] reversed = reverseHorizontally(matrix);
        System.out.println("Obrácená matice:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(reversed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
