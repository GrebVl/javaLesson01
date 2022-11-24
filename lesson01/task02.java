/**
 * Вывести все простые числа от 1 до 1000
 */


public class task02 {
    public static void main(String[] args){
        int nums = 1000;
        for(int i = 1; i <= nums; i++){
            int count = 0;
            for(int j = 1; j <= nums; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.printf(" %d ", i);
            }
        }
    }
}
