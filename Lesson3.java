import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        try {
            String userData = readUserData();
            saveUserData(userData);
            System.out.println("Данные успешно сохранены.");

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка валидации данных: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
            e.printStackTrace();
        }

    }

    public static String readUserData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные в формате: Фамилия Имя Отчество датарождения номертелефона пол");
        String input = scanner.nextLine();
        scanner.close();
        return input.trim();
    }

    public static void saveUserData(String userData)throws IOException{
        String[] dataParts = userData.split("\\s+");
        if (dataParts.length != 6) {
            throw new IllegalArgumentException("Неверное количество данных. Требуется 6 параметров.");
        }
        String lastName = dataParts[0];
        String firstName = dataParts[1];
        String middleName = dataParts[2];
        String birthDate = dataParts[3];
        String phoneNumber = dataParts[4];
        String gender = dataParts[5];

        if (!isValidBirthDate(birthDate)) {
            throw new IllegalArgumentException("Некорректный формат даты рождения. Используйте формат dd.mm.yyyy.");
        }

        if (!isValidPhoneNumber(phoneNumber)) {
            throw new IllegalArgumentException("Некорректный формат номера телефона. Используйте целое беззнаковое число.");
        }

        if (!isValidGender(gender)) {
            throw new IllegalArgumentException("Некорректное значение пола. Используйте символ 'f' или 'm'.");
        }

        String fileName = lastName + ".txt";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(lastName + firstName + middleName + " " + birthDate + " " + phoneNumber + " " + gender + "\n");
        }

    }
    public static boolean isValidBirthDate(String birthDate) {
        return birthDate.matches("\\d{2}\\.\\d{2}\\.\\d{4}");
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d+");
    }

    public static boolean isValidGender(String gender) {
        return gender.equals("м") || gender.equals("ж");
    }
}
