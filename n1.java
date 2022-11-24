import java.util.Scanner;

public class n1 {

    public static void main(String[] args) {
        int resDate, resMonth,resYear;
        int nowDate = 25;
        int nowMonth = 11;
        int nowYear = 2022;
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите дату дня рождения: ");
        int date = scan.nextInt();
        if(date>31 || date<0) {
            System.out.println("Вы ввели неверное значение, попробуйте ещё раз");
            System.exit(0);
        }

        System.out.print("Введите месяц рождения: ");
        int month = scan.nextInt();
        if(month>12 || month<0) {
            System.out.println("Вы ввели неверное значение, попробуйте ещё раз");
            System.exit(0);
        }

        System.out.print("Введите год рождения: ");
        int year = scan.nextInt();
        if(year>2022 || year<1900) {
            System.out.println("Вы ввели неверное значение, попробуйте ещё раз");
            System.exit(0);
        }

        if(nowDate>=date && nowMonth>=month){
            resDate = nowDate - date;
            resYear = nowYear - year;
            resMonth = nowMonth - month;
            System.out.println("Вам " + resYear +" лет, " + resMonth + " месяцев и " + resDate + " дней.");
        }
        if(nowDate>=date && nowMonth<month){
            resDate = nowDate - date;
            resYear = nowYear - year - 1;
            resMonth = nowMonth+12 - month;
            System.out.println("Вам " + resYear +" лет, " + resMonth + " месяцев и " + resDate + " дней.");
        }
        if(nowDate<date && nowMonth>=month){
            resDate = nowDate+30 - date;
            nowMonth--;
            if(nowMonth == month){
                resMonth = nowMonth+12 - month;
                resYear = nowYear - year - 1;
            } else {
                resMonth = nowMonth - month;
                resYear = nowYear - year;
            }
            System.out.println("Вам " + resYear +" лет, " + resMonth + " месяцев и " + resDate + " дней.");
            }
        if(nowDate<date && nowMonth<month) {
            resDate = nowDate + 30 - date;
            resYear = nowYear - year - 1;
            resMonth = nowMonth + 12 - month - 1;
            System.out.println("Вам " + resYear + " лет, " + resMonth + " месяцев и " + resDate + " дней.");
        }
    }
}