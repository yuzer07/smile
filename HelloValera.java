/**
 * Created by Кирилл on 14.10.2016.
 */
import java.util.Scanner;

public class HelloValera {

    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.print("Здравствуйте! Введите имя:");
        String name = s.nextLine();
        System.out.print("Привет ," +name);
    }
}

