/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */

import java.util.Scanner;

public class Lesson2_4 {
    public static void main(String[] args) {
       readInput();
        
    }

    
    public static void readInput() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите что-то: ");
            String input = scanner.nextLine().trim();
            
            if (input.isEmpty()) {
                throw new IllegalArgumentException("Пустые строки вводить нельзя!");
            }
            System.out.println("Вы ввели: " + input);
            
            
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }








}
