import java.util.Scanner;

public class n3 {
    public static void main(String[] args){
        int c = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число = ");
        int x = scan.nextInt();
        System.out.print("Введите степень числа = ");
        byte n = scan.nextByte();
        if(n<-15 || n>15){
            System.out.print("Слишком большая степень, введите число поменьше");
            System.exit(0);
        }
        for(byte i = 1; i <= Math.abs(n); i++) {        //while(i<=Math.abs(n)) {c = c*x, i++}
            c = c * x;
        }
        if(n>0)
            System.out.print("Ответ = " + c);
        if(n<0){
            float bb = (float)1/c;
            System.out.print("Ответ = " + bb);
        }
    }
}