import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int a;
    int b;
    int suma;
    System.out.println("Podaj pierwszą liczbę");
    Scanner pierwsza = new Scanner(System.in);
    a= pierwsza.nextInt();
    System.out.println("Podaj drugą liczbę");
    Scanner druga = new Scanner(System.in);
    b= druga.nextInt();
    suma=a+b;
    System.out.println("Suma liczb wynosi " + suma );
  }
}