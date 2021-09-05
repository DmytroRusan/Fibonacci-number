public class Main {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 1;
        int number3;
        System.out.print(0 + " " + number1 + " " + number2 + " ");
        for (int i = 0; i < 10; i++) {
            number3 = number1 + number2;
            System.out.print(number3 + " ");
            number1 = number2;
            number2 = number3;
        }
        System.out.println();
    }
}
