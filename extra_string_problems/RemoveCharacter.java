package week1_ExtraQuestions1;

import java.util.*;

public class RemoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);
        String result = str.replace(String.valueOf(ch), "");
        System.out.println("Modified String: " + result);

	}

}
