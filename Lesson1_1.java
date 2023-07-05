import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */

public class Lesson1_1 {

    public static void main(String[] args) {
        try {
            divideByZero(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль запрещено");
        }

        try {
            readFromFile("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        try {
            double res = calculateSquareRoot(-1);
            System.out.println(res);
        } catch (IllegalArgumentException e) {
            System.out.println("Число не может быть отрицательным");
        }
    }

    public static void divideByZero(int a ,int b){
        int result=a/b;
        System.out.println(result);
    }

    public static void readFromFile(String filename) throws FileNotFoundException{
        File file = new File(filename);
        Scanner scanner =  new Scanner(file);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();

    }
    public static double calculateSquareRoot(double num) throws IllegalArgumentException{
        if (num < 0) {
        throw new IllegalArgumentException();
        }
    
        return Math.sqrt(num);
    }
}


