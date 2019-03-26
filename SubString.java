import java.util.*;

public class SubString{

	public static void mirrorMatching(List<Character> characters ){
	
		System.out.println(characters + " length :"+ characters.size());
		int l = characters.size(), x = 0, y = 0;
		String mirror = "  ";

		/*
			boolean x = isTrue( characters.get(0), characters.get(5));
			System.out.println(x); 
		*/

		for(int i = 0; i < l-5 ; i++){
			x = i + 3;
			
			for(int j = 0; j < x; j++){
				if(isTrue(characters.get(j), characters.get(x--))){
					y++;
					System.out.println(mirror);
					mirror = mirror + characters.get(j);
					continue;
				}
				else
					break;
			}

			if(y > 2)		
				System.out.println(mirror);
			else{
				y = 0;
				mirror = null;
			}
		}
		
		
	}

	public static boolean isTrue( Character a, Character b){
		if(a == b) return true;
		return false;
	}

	public static List<Character> convertingString(String string){
	
		List<Character> characters = new ArrayList<>();
		
		for(char character : string.toCharArray()){
			characters.add(character);		
		}
		
	return characters;
		
	}

	public static void main(String[] args){
		String pattern = "abccbaxxbbxx";
		List<Character> ch = convertingString(pattern);
		mirrorMatching(ch);
		
		System.out.println("\n "+ch);
	}

}