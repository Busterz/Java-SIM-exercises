1. (a) (i) x==3 and not x=3 <br>
       &nbsp; &nbsp; &nbsp;(ii) x is declared twice <br>
       &nbsp; &nbsp; &nbsp;(iii) int s = 2 or String s = *string*
       
   (b) (i)
       ```java
       public static int powerA(int a, int b){
         int p = 1;
         for(int i=0; i<b; i++){
           p = prod(powerA, a);     //p *= a;
         }
         return p;
       }
       ```
      
       &nbsp; &nbsp; &nbsp;(ii)
       ```java
       public static int powerB(int a, int b){
         if(b==0) return 1;
         if(b==1) return a;
         if(b!=0 && b!=1){
           return a*powerB(a, b-1);
         }
       }
       ```
       
   (c)
   ```java
   public static void Pattern(){
      int n=4;
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
   ```
   
   
2. (a) (i) 2.5 <br>
       &nbsp; &nbsp; &nbsp;(ii) 15 <br>
       &nbsp; &nbsp; &nbsp;(iii) true
       
   (b) (i)
       ```java
       public class Sumx{
         public static void main(String[] args){
           int sum = 0;
           int size = args.length;
           int[] n = new int[size];
           for(int j=o; j<size; j++){
            n[j] = Integer.parseInt(args[j]);
           }
           for(int i=0; i<size; i++){
            sum += n[i];
           }
           System.out.println("The sum is: " + sum);
         }
       }
       ```
      
       &nbsp; &nbsp; &nbsp;(ii)
       ```java
       public static void CopyMe(){
         Scanner in = new Scanner(new FileReader("book1.txt");
         PrintWriter write = new PrintWriter(new FileOutputStream("book2.txt"));
         if(in.hasNext()){
          write.println(in.nextLine());
         }
         in.close();
         write.close();
       }
       ```
       
   (c)
   ```java
   public static void Wordsearch(){
      Scanner read = new Scanner(new FileReader("words.txt"));
      Scanner in = new Scanner (System.in);
      String wordIn = in.nextLine();
      while(read.hasNext()){
        if(wordIn.equals(read.nextLine())){
          System.out.println("YES");
          break;
        }
        else if(read.hasNext() == false){
          System.out.println("NO");
        }
      }
   }
   ```
   
3. (a) (i) 32 <br>
       &nbsp; &nbsp; &nbsp;(ii) WWW <br>
       &nbsp; &nbsp; &nbsp;(iii) 9
       
   (b) (i) Red <br>
       &nbsp; &nbsp; &nbsp;(ii) Black <br>
       &nbsp; &nbsp; &nbsp;(iii) Black <br>
       &nbsp; &nbsp; &nbsp;(iv) Black
       
   (c) (i) Vector hold = new Vector(); <br>
       &nbsp; &nbsp; &nbsp;(ii) hold.addElement(5) <br>
       &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; hold.addElement("SIM") <br>
       &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; hold.addElement(2.7) <br>
       &nbsp; &nbsp; &nbsp;(iii) for(int i=0; i	&lt; hold.size(); i++) System.out.println(hold.elementAt(i); <br>
       &nbsp; &nbsp; &nbsp;(iv) hold.removeElementAt(2);
       
       
4. (a) (i) 6 <br>
       &nbsp; &nbsp; &nbsp;(ii) 2 <br>
       &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 4 <br>
       &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 6 <br>
       &nbsp; &nbsp; &nbsp;(iii) 3
       
    (b)
       ```java
       public class Cube extends Rectangle{
         private double height;
         
         public Cube(double len, double w, double h){
           super(len, w);
           height = h;
         }
         
         public double getSurfArea(){
           double surfArea = 6 * super.getArea();
           return surfArea;
         }
         
         public void dimensions(){
           super.dimensions();
           System.out.println("Height: " + height);
         }
       }
       ```   
       
    (c) (i) Cube myCube = new Cube(length, width, height); <br>
        &nbsp; &nbsp; &nbsp;(ii) System.out.println("The surface area is: " + myCube.getSurfArea());
