import java.util.Scanner;

/**
 * Created by Кирилл on 24.10.2016.
 */

public class RegexTest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int max = 100;
        int mass [] = new int[10] ;
for (int i = 0; i < 10; i++){
    mass [i] = (int) Math.floor(Math.random() *max);
}
        for (int i = mass.length - 1; i > 0; i--)
        {
            for (int a = 0; a < i; a++)
            {
                if (mass[a] > mass[a + 1])
                {
                    mass[a] = mass[a] + mass[a+1];
                    mass[a+1] = mass[a] - mass[a+1];
                    mass[a] = mass[a] - mass[a+1];
                }
            }
        }

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
    }
}


