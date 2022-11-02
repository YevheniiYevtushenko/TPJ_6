import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("2)");
        for(float x = -1; x<=1; x+=0.1)
        {
            System.out.println("y="+( 1/(Math.sin(Math.pow(x, x))) + 1/(Math.cos(Math.pow(x, x)))));
        }
        Scanner scan = new Scanner(System.in);
        int[] j = new int[3];
        System.out.println("\n3)");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " Число: ");
            j[i] = scan.nextInt();
        }
        System.out.println("Не прості числа: ");
        for (int i = 0; i < 3; i++) {
            if (j[i] % 2 == 0 || j[i] % 3 == 0 || j[i] % 5 == 0 || j[i] % 7 == 0)
                System.out.println(j[i]);
        }
        System.out.println("\n4) Введіть рядки:");
        Scanner scan2 = new Scanner(System.in);
        String str1 = null, str2;
        do {
            str2 = scan2.nextLine();
            if(str1 == null || (str1.length() < str2.length() && !str1.equalsIgnoreCase("done"))) {
                str1 = str2;
            }
        }while(!str2.equalsIgnoreCase("done"));
        scan.close();
        System.out.println("Найдовшший введений рядкок: " + str1);
    }
}