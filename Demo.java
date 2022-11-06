
public class Demo {

    public static void sortArray(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public static double division(double number1, double number2) throws ArithmeticException {
        if (number2 == 0) {
            throw new ArithmeticException("Cannot divid by Zero!");
        }

        return number1 / number2;
    }
}
