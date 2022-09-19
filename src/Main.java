import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1;
        double x2;
        double x3;
        double x4;

        while (true) {
            System.out.print("Введите первыое число: ");
            x1 = in.nextInt();
            if (x1 < 0) {
                System.out.println("Число не может быть меньше 0");
                continue;
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("Ввкдите второе число: ");
            x2 = in.nextInt();
            if (x2 < 0) {
                System.out.println("Число не может быть меньше 0");
                continue;
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("Введите третье число: ");
            x3 = in.nextInt();
            if (x3 < 0) {
                System.out.println("Число не может быть меньше 0");
                continue;
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("Введите четвертое число: ");
            x4 = in.nextInt();
            if (x4 < 0) {
                System.out.println("Число не может быть меньше 0");
                continue;
            } else {
                break;
            }
        }

        in.close();

        //возвращаем квадратный корень
        System.out.printf("sqrt(%.3f) = %.3f%n", x1, Math.sqrt(x1));
        System.out.printf("sqrt(%.3f) = %.3f%n", x2, Math.sqrt(x2));
        System.out.printf("sqrt(%.3f) = %.3f%n", x3, Math.sqrt(x3));
        System.out.printf("sqrt(%.3f) = %.3f%n", x4, Math.sqrt(x4));
    }
}