public class Main {
    public static void main(String[] args) {

// Задание 1.
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println("-----------------------------------------");

// Задание 2.
        String fullNameUpper = fullName.toUpperCase();
        System.out.println(fullNameUpper);

        System.out.println("-----------------------------------------");

// Задание 3.
        fullName = "Иванов Семён Семёнович";
        String fullNameReplace = fullName.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника - " + fullNameReplace);
    }
}