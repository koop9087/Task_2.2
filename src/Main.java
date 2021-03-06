import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = CustomScanner.scannerInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = CustomScanner.scannerInt();
        }
        CustomWriter.writer(Arrays.toString(array));
        CustomWriter.writer(Arrays.toString(Calculate.count(array)));

    }
}