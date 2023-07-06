/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и
возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных */

import java.util.Scanner;

public class Lesson2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        float res = readFloatNum(scanner);
        System.out.println("Введенное число: " + res); 
        scanner.close();
    }

    public static float readFloatNum(Scanner scanner){
            
            float number = 0;
            boolean validInput = false;

            while(!validInput){
                try {
                    System.out.print("Введите дробное число: ");
                    String input = scanner.nextLine();
                    number = Float.parseFloat(input);
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод. Пожалуйста, введите дробное число.");
                }
            }
            return number;
        
        }
}


