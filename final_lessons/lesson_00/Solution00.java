import java.util.*;

public class Solution00{
	public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

	public static String getShifted(String input, int amt){
		String toReturn = "";
		for (int i = 0; i < input.length(); i++){
			int index = alphabet.indexOf(input.charAt(i));
			int newIndex = (index + amt) % alphabet.length();
			toReturn += alphabet.charAt(newIndex < 0 ? newIndex + 26 : newIndex);
		}
		return toReturn;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		String line;
		System.out.println("usage: <plaintext> <shift_amt>");
		System.out.print(">");
		while (!(line = in.nextLine()).equals("")){
			String[] req = line.split(" ");
			System.out.print("Output: ");
			try{
				System.out.println(getShifted(req[0], Integer.parseInt(req[1])));
			} catch (Exception e){
				System.out.println(Arrays.toString(req));
				System.out.println("error");
				System.out.println("usage: <plaintext> <shift_amt>");
			}
			System.out.print(">");
		}
		in.close();
	}
}