//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 33; // Изменить значение для проверки

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        int temperature = 6; // Изменить значение для проверки

        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        int speed = 50; // Изменить значение для проверки

        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        int age1 = 25; // Изменить значение для проверки

        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад.");
        } else if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу.");
        } else if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университет.");
        } else if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить на работу.");
        }

        int age2 = 15; // Изменить значение для проверки

        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на аттракционе");
        } else if (age2 <= 14) { // Включает возраст ровно 14 лет
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else { // age > 14
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        int passengers = 50; // Изменить значение для проверки
        final int MAX_CAPACITY = 102;
        final int SITTING_SEATS = 60;

        if (passengers == MAX_CAPACITY) {
            System.out.println("Вагон уже полностью забит.");
        } else if (passengers > SITTING_SEATS) {
            System.out.println("Есть место, но только стоячее.");
        } else {
            System.out.println("Есть место, в том числе сидячее.");
        }

        int one = 111; // Изменить значение для проверки
        int two = 322; // Изменить значение для проверки
        int three = 555; // Изменить значение для проверки

        if (one >= two && one >= three) {
            System.out.println("Наибольшее " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее " + two);
        } else if (three >= one && three >= two) {
            System.out.println("Наибольшее " + three);
        }
    }
}