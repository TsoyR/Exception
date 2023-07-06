    /* Если необходимо, исправьте данный код
    try {
    int d = 0;
    double catchedRes1 = intArray[8] / d;
    System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
    System.out.println("Catching exception: " + e);
    }
 */


public class Lesson2_2 {
    public static void main(String[] args) {
    int[]intArray = {1, 2, 3, 4, 5, 6, 7};
    try {
    int d = 0;
    double catchedRes1 = intArray[6] / d;
    System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e.getMessage());
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Недопустимый индекс массива");
    }
    }
}
