
public class PrintCMDArguments {
	public static void main(String[] args){
		int size = args.length;
		if(size == 3){
			for(int i=0; i<size; i++){
				System.out.println(args[i]);
			}
		}
		else if(size < 3){
			System.out.println("It has to be minimum of 3 numbers, please rerun.");
		}
		else if(size > 3){
			System.out.println("Error encountered, only 3 arguments are allowed");
		}
	}
}
