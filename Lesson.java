/**
 * Created by Кирилл on 17.10.2016.
 */
import java.util.Scanner;

public class Lesson {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число:");
        String next = " ";
        while (!(next.equals("30"))) {
            next = s.nextLine();
            if ((next.equals("30"))) {
                System.out.println("Верно!");
            } else {
                System.out.println("Это не верный ответ, попробуйте ответить еще раз");
            }

        }
    }
}