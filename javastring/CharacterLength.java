package javastring;

import java.util.Iterator;

public class CharacterLength {

	public static void main(String[] args) {
String Name = "Renganayagi";
int count = 0;
for (int i = 0; i < Name.length(); i++) {
	
	if(Name.charAt(i)== 'a') {
		count++;
	
	}
		
}
System.out.println("Number of occurrence of 'a':" +count);	
}
	}


