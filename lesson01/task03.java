/**
 * Реализовать простой калькулятор
 */

import java.util.Scanner;

public class task03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите операцию +, -, *, /, ! : ");
        String str = scan.nextLine();
        if(str.equals("!")){
            System.out.print("Введите число n: ");
            int n = scan.nextInt();
            int res = 0;
            if(n != 0){
                res++;
                for(int i = 1; i <= n; i++){
                    res *= i;
                }
            }
            System.out.printf("результат равер %d \n", res);
        }
        else {
            System.out.print("Введите число a: ");
            int a = scan.nextInt();
            System.out.print("Введите число b: ");
            int b = scan.nextInt();
            if (str.equals("+")){
                System.out.printf("результат равер %d + %d = %d \n", a, b, a+b);
            }
            else if (str.equals("-")){
                System.out.printf("результат равер %d - %d = %d \n", a, b, a-b);
            }
            else if (str.equals("*")){
                System.out.printf("результат равер %d * %d = %d \n", a, b, a*b);
            }
            else if (str.equals("/")){
                System.out.printf("результат равер %d / %d = %d \n", a, b, a/b);
            }
        }
        scan.close();
    }
}