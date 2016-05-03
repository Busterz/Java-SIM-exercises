import java.util.Random;
public class tossCoin{
  public static void main(String[] main){
    String[] s = {"head", "tail"};
    Random r = new Random();
    int i = r.nextInt(2);
    System.out.println(s[i]);
  }
}
