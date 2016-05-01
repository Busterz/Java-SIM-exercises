
public class Sumx {
	public static void main (String[] args){
		int sum = 0;
		int size = args.length;
		int[] n = new int[size];
		for(int j=0; j<size; j++){
			n[j] = Integer.parseInt(args[j]);
		}
		for(int i=0; i<size; i++){
			sum += n[i];
		}
		System.out.println("The sum is: " + sum);
	}
}
