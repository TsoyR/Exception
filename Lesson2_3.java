/*Дан следующий код, исправьте его там, где требуется
 (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit) */

public class Lesson2_3 {
    public static void main(String[] args) {
    try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(3, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (IllegalArgumentException ex) {
        System.out.println("Недопустимый аргумент!");
   }catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   }
}
public static void printSum(Integer a, Integer b) throws IllegalArgumentException {
    if (a == null || b == null) {
       throw new IllegalArgumentException("Аргументы не могут быть null");
    }
    System.out.println(a + b);
    
}

}

