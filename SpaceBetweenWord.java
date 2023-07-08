package doSelect;

import java.util.Scanner;
import java.util.stream.Collectors;

public interface SpaceBetweenWord {
String addSpace(String str);
}
public class Space{

	public String String (String s)
	{

		String str1=s.chars().mapToObj(i -> (char) i + " ").collect(Collectors.joining());
		return str1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner =new Scanner(System.in);
	String message="capgemini";
	SpaceBetweenWord source = new SpaceBetweenWord();
	SpaceBetweenWord stringSpace=source::insertSpace;
	String m=stringSpace.addSpace(message);
	System.out.println(m);
	}

}