import java.util.Scanner;

public class resta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca número 1");
        int num1 = sc.nextInt();
        System.out.println("Introduzca número 2");
        int num2 = sc.nextInt();

        System.out.println("El resultado de la resta de: " + num1 + " + " + num2 + " = " +  (num1-num2) );
        sc.close();
    }
}
