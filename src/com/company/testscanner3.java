import java.util.Scanner;

public class testscanner3 {

  public static void main(String[] args) {
    //scanner
    Scanner input = new Scanner(System.in);

    //variabler
    double a;
    double b;

    //præsentation
    System.out.println("vi skal lave en firkant og finde arealet");

    //hvad er a?
    System.out.println("skriv et tal");

    a = input.nextDouble();
    System.out.println(a);

    //hvad er b?
    System.out.println("skriv et tal");

    b = input.nextDouble();
    System.out.println(b);

    //hvad er arealet?
    double c = (a * b);

    System.out.println("hvad er arealet?");
    System.out.println((int)c);



  }
}