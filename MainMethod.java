/*

Example for main method overloading
	-- main method can overloaded 
	-- but jvm can only run p.s.v.m (String[] args)

*/

public class MainMethod{

	public static void main(String[] args){
		
		System.out.println("main(String[] args)");
		
	}

	public static void main(String[] args, int x){
		
		System.out.println("main(String[] args), int x");
		
	}
	
	public static void main(int y, int x){
		
		System.out.println("main(int y, int x)");
		
	}

}