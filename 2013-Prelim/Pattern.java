public class Pattern{
  public static void Pattern(){
    int n = 4;
    int starCounter = 1;
    for(int i=n; i>0; i--){
      for(int j=i-1; j>=0; j--){
        System.out.print(" ");
      }
      for(int j=0; j<starCounter; j++){
        System.out.print("*");
      }
      starCounter += 2;
      System.out.println("");
    }
  }

  public static void main(String[] args){
    Pattern();
  }
}
