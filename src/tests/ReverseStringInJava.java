package tests;


public class ReverseStringInJava {

	
	public void reverseEverything(String s){
	
		StringBuffer strb = new StringBuffer();
		//iterating reverse from last to first char on the String
		for( int i=s.length()-1; i>=0; i--){
		strb = strb.append(s.charAt(i));
		}
		System.out.println("Original String is : " + s);
		System.out.println("Reversed String is : " +strb);
		}
	

	public static void main(String[] args) {
		
		//Calling reverseEverything(String s)method creating obj ref to the ReverseString Class
		ReverseStringInJava rVstr= new ReverseStringInJava();
		String s="hope you are doing well";
		rVstr.reverseEverything(s);
	}

}
