import java.util.Scanner;

public class invertedPyramid{
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.print("Enter Inverted Pyramid Pattern Rows = ");
        int rows = sc.nextInt();

        System.out.println("Printing Inverted Pyramid Star Pattern");

        for (int i = rows ; i >= 1; i-- )
        {
            for (int j = 0 ; j < rows - i; j++ )
            {
                System.out.print(" ");
            }
            for (int k = 0 ; k != (2 * i) - 1; k++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
