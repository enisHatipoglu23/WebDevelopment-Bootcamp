import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
// get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ROW number: ");
        int row = scanner.nextInt();
        System.out.println("Enter COLUMN number: ");
        int col = scanner.nextInt();
        int size = row*col;
        System.out.println(size + " number you will enter. ");
        int[][] baseMatrix = new int[row][col];
        int[][] transpose = new int[col][row];

        // create base matrix
        for (int i = 0; i < baseMatrix.length; i++) {
            System.out.println("Enter " + (i+1) + ". row: ");
            for (int j = 0; j < baseMatrix[i].length; j++) {
                System.out.println((i+1) + ". row - " + (j+1) + ". column: ");
                baseMatrix[i][j] = scanner.nextInt();
            }
        }
        // print base matrix
        System.out.println("BASE");
        for (int i = 0; i < baseMatrix.length; i++) {
            for (int j = 0; j < baseMatrix[i].length; j++) {
                System.out.print(baseMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("************");
        System.out.println("TRANSPOSE");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                transpose[i][j] = baseMatrix[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}