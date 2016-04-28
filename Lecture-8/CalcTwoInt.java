/*
Write a program to take in 3 cmd arguments with 1st and 3rd being an int while 2nd argument is an arithmetic operator.
The program will print out the result of the calculation if the inputs are correct.
*/
public class CalcTwoInt{
    //this file is run from the command line
    public static void main(String[] args){
        int size = args.length;
        if(size == 3){
            if(args[1].equalsIgnoreCase("+")){
              System.out.println("The result is " + (Integer.parseInt(args[0]) + Integer.parseInt(args[2])));
            }
            else if(args[1].equalsIgnoreCase("-")){
              System.out.println("The result is " + (Integer.parseInt(args[0]) - Integer.parseInt(args[2])));
            }
            else if(args[1].equalsIgnoreCase("*")){
              System.out.println("The result is " + (Integer.parseInt(args[0]) * Integer.parseInt(args[2])));
            }
            else if(args[1].equalsIgnoreCase("/")){
              System.out.println("The result is " + (Integer.parseInt(args[0]) / Integer.parseInt(args[2])));
            }
            else{
              System.out.println("The second argument has to be an arithmetic operator, please try again.");
            }
        }
        else{
            System.out.println("Only can accept 3 arguments, please re-run.");
        }
    }
}
