/**
 * +Задано уравнение вида q + w = e, 
 * где q, w, e >= 0. 
 * Некоторые цифры могут быть заменены знаком вопроса,
 *  например 2? + ?5 = 69.
 *  Требуется восстановить выражение до верного равенства.
 *  Предложить хотя бы одно решение или сообщить, что его нет.
 */ 
import java.util.Scanner;

public class task04 {
    static String getType(String a, int num){
        char x = Character.forDigit(num, 10);             
        String c = a.replace('?', x);
        return c;
        }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение q: ");
        String num1 = scan.nextLine();
        System.out.print("Введите значение w: ");
        String num2 = scan.nextLine();
        System.out.print("Введите значение e: ");
        String num3 = scan.nextLine();
        System.out.printf("%s + %s = %s \n", num1, num2, num3);
        int count = 0;
        for(int i = 0; i<=9; i++){
            for(int j = 0; j<=9; j++){
                int q = Integer.parseInt(getType(num1, i));
                int w = Integer.parseInt(getType(num2, j));
                int e = Integer.parseInt(num3);
                if(q + w == e){
                    System.out.printf("%d + %d = %d \n", q, w, e);
                    count++;
                } 
            }
        }
        if(count == 0){
            System.out.println("Решение не найдено");
        }
    }
}
