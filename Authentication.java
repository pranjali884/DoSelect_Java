package doSelect;

public class Authentication {

	public static void main(String[] args) {
		
		String username="ABC";
		String password="DEF";
		
		Authentication aut=new Authentication();
		
		boolean valid=aut.AuthenticationInterface (username,password);
		
		System.out.println("is valid "+valid);
	}

	private boolean AuthenticationInterface(String username, String password) {
		
	AuthenticationInterface aut=(u,p) ->u.equals("ABC")&& p.equals("DEF");
		return
				aut.isvalid(username,password);
	}

}
