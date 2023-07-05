public class Lesson1_2 {
    public static void main(String[] args) {
        String[][] twoArray = {{"dasda","0","0","dsd"},{"0","0","0","0","1"},{"0","0","0","0","1"},{"0","0","0","0","1"}};
        int result = sum2d(twoArray);
        System.out.println(result);
    }

    public static int sum2d(String[][]arr){
        int sum =0;
        for (int i=0;i<arr.length;i++){
            for(int j =0;j<5;j++){
                try {
                    int val = Integer.parseInt(arr[i][j]);
                    sum+=val;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка преобразования строки в число: " + arr[i][j]);
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Выход за границы массива: i=" + i + ", j=" + j);
                }
                
            }
        }
        return sum;
    }
}
