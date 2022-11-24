/**
* Вычислить n-ое треугольного число
* (сумма чисел от 1 до n), 
* n! (произведение чисел от 1 до n)
*/
import java.util.Scanner;

public class task01{
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите операцию + или !: ");
        String str = scan.nextLine();
        System.out.print("Введите число: ");
        int n = scan.nextInt();
        int res = 0;
        if (n != 0 && str.equals("!")){
            res++;
        }
        for(int i = 1; i <= n; i++){
            if(str.equals("!")){
                res *= i;
            }
            else if(str.equals("+")){
                res += i;
            }
        }
        scan.close();
        System.out.printf("результат равер %d \n", res);
    }
}