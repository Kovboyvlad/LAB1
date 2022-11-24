import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число/дату: ");
        int day = scan.nextInt();
        if (day > 31 || day < 0) {
            System.out.print("Вы ввели неверное значение, попробуйте ещё раз");
            System.exit(0);
        }
        System.out.print("Введите номер месяца: ");
        int month = scan.nextInt();
        if (month > 12 || month < 0) {
            System.out.print("Вы ввели неверное значение, попробуйте ещё раз");
            System.exit(0);
        }
        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Это - Зима");
        }
        if (month == 3 || month == 4 || month == 5) {
            System.out.println("Это - Весна");
        }
        if (month == 6 || month == 7 || month == 8) {
            System.out.println("Это - Лето");
        }
        if (month == 9 || month == 10 || month == 11) {
            System.out.println("Это - Осень");
        }
    }
}