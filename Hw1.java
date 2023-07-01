import java.util.Scanner;

class Hw1 {
    static int getTriangleNumber(int n) {
        int sum = 0;
        for (int index = 0; index < n; index++) {
            sum += index + 1;
        }
        return sum;
    }

    static int getFactorial(int n) {
        int result = 1;
        for (int index = 0; index < n; index++) {
            result *= index + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 0;
        System.out.printf("Введи натуральное число: ");
        if (!scn.hasNextInt()) {
            System.out.println("Ты ввел неправильное число");
        } else {
            n = scn.nextInt();
            if (n < 1)
                System.out.println("Ты долежн ввести только положительное число");
            else {
                System.out.printf("Треугольное число %d is: %s! ", n, getTriangleNumber(n));
                System.out.println();
                System.out.printf("Факториал числа %d is: %s! ", n, getFactorial(n));
            }
        }
        scn.close();
    }
}