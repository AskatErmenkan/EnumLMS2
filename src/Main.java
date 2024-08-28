import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Күндөрдүн бирин англисче жаз (MONDAY, TUESDAY, ...): ");
        String input = scanner.next().toUpperCase();


        try {
            DaysOfWeek day = DaysOfWeek.valueOf(input);
            System.out.println(day.getLesson());
        } catch (IllegalArgumentException e) {
            System.out.println("Мындай аталыштагы аптанын күнү жок. Күндөрдү MONDAY, TUESDAY, ... түрүндө жаз.");
        }
    }
}