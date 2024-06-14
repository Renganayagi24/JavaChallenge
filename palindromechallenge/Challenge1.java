package palindromechallenge;

public class Challenge1 {

	public static void main(String[] args) {
	String input = "A man, a plan, a canal: Panama"	;
    String lowerCase = input.toLowerCase();
    System.out.println(lowerCase);
    String Result = input.replaceAll("[^a-zA-Z]", "");
    System.out.println(Result);
	StringBuilder stb = new StringBuilder(Result);
	
	String output = stb.reverse().toString();
	System.out.println("The output is:--"+output);
	if(output==Result) {
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
	
	}
    
	}

