import java.util.Scanner;

public class testscanner2 {

  public static void main(String[] args) {
    //scanner
    Scanner input = new Scanner(System.in);

    //variabler
    int a;
    int b;

    //hvad er a?
    System.out.println("skriv et tal");

    a = input.nextInt();
    System.out.println(a);

    //hvad er b?
    System.out.println("skriv et tal");

    b = input.nextInt();
    System.out.println(b);

    //hvad er c?
    int c = (a + b);

    System.out.println("Vi giver tallene, når vi lægger dem sammen?");
    System.out.println(c);

    //hvad er d?
    int d = (a * b);

    System.out.println("Vi giver tallene, når vi ganger dem sammen?");
    System.out.println(d);

  }
}
