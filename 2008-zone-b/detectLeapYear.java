import java.util.Scanner;
public class detectLeapYear{
  public static void main(Stringp[] args){
    Scaner in = new Scanner(System.in);
    System.out.print("Enter the year: ");
    int y = in.nextInt();
    if((y%4==0 && y%100!=0) || y%400==0){
      System.out.println("It is a leap year");
    }
    else{
      System.out.println("It is not a leap year");
    }
  }
}
