// ОСНОВНОЕ ДЗ:
public class Main {
    public static void main(String[] args) {
        double[] array ={-1.1, 2.2, -3.3, 4.4, -5.5, 6.6, -7.7, 8.8, -9.9, 10.10, -11.11, 12.12, -13.13, 14.14, -15.15};
        double result = 0.0;
        int positiveNumber = 0;

        for (double i:array) {
            if(i>0) {
                result += i;
                positiveNumber++;
            }
        }
        System.out.println((int)result/positiveNumber);


        // ДОПОЛНИТЕЛЬНОЕ ДЗ:
        int temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            System.out.println();
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    temp = (int) array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
                System.out.print((array[i])+", ");
            }
        }

        System.out.println("\n");
        for(double i: array) {
            System.out.print((i) + ", ");
        }
    }
}