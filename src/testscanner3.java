import java.util.Scanner;

public class testscanner3 {

  public static void main(String[] args) {
    //scanner
    Scanner input = new Scanner(System.in);

    //variabler
    String name;
    String rollNumber;
    String interest;

    //hvad er navnet?
    System.out.println("skriv dit navn");

    name = input.nextLine();
    System.out.println(name);

    //hvad er dit roll number?
    System.out.println("hvad er dit rollnumber");

    rollNumber = input.nextLine();
    System.out.println(rollNumber);

    //hvad er din interresse?
    System.out.println("hvad er til din interesse?");

    interest = input.nextLine();
    System.out.println(interest);

    //introduktion
    System.out.println("Hej, du hedder " + name + "dit rollnumber er" + rollNumber + "dine interresser er " + interest);


  }
}