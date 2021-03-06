import java.util.Scanner;

public class CustomScanner {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static int scannerInt() {
        int num = SCANNER.nextInt();
        return num;
    }
}
