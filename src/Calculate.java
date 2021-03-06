public class Calculate {
    public static int[] count(int[] array) {
        int[] mas = new int[3];
        int countOfPositive = 0;
        int countOfZero = 0;
        int countOfNegative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                countOfPositive++;
            } else if (array[i] == 0) {
                countOfZero++;
            } else {
                countOfNegative++;
            }
        }
        mas[0] = countOfPositive;
        mas[1] = countOfZero;
        mas[2] = countOfNegative;
        return mas;
    }
}