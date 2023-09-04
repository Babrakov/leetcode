public class SimpleGCD {
    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 48;

        int gcd = findGCD(num1, num2);

        System.out.println("Наибольший общий делитель чисел " + num1 + " и " + num2 + " равен " + gcd);
    }

    // Метод для нахождения НОД с использованием алгоритма Эвклида
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
