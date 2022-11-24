import java.util.Scanner;

public class n4 {
    public static void main(String[] args){
        int k = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество точек: ");
        int N = scan.nextInt();
        System.out.print("Введите радиус = ");
        double r = scan.nextDouble();

        for (int i=1;i<=N;i++){
            System.out.print("Введите координату Х" +i+  ": ");
            double X = scan.nextDouble();
            System.out.print("Введите координату Y: ");
            double Y = scan.nextDouble();
            if(X*X+Y*Y<=r*r)
                k++;
        }
        System.out.print("Количество точек - " + k);
    }
}
