package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Birthdays {

    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {

        int a = 0;

        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - E", Locale.ENGLISH);

        String text = System.lineSeparator();

        while ((birthday.isBefore(today)) || birthday.isEqual(today)) {

            text = text + a + " - " + formatter.format(birthday) + System.lineSeparator();
            birthday = birthday.plusYears(1);
            a = a + 1;
        }
        if (birthday.isEqual(today)) {
            text = a + "-" + formatter.format(today);
        }
        return text;


        //TODO реализуйте метод для построения строки в следующем виде
        //0 - 31.12.1990 - Mon
        //1 - 31.12.1991 - Tue
    }
}
