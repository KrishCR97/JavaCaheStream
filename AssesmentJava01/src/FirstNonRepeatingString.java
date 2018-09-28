import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingString {
	
	public static void main(String... args) {
		
		String data = "shivas";
		char uniqueCharater = 'n';
		
		Map<Character,Integer> mapData = new LinkedHashMap<>();
		
		for(int index = 0; index < data.length();index++) {
			if(mapData.get(data.charAt(index)) == null) {
				mapData.put(data.charAt(index), 1);
			}
			else {
				mapData.put(data.charAt(index), (mapData.get(data.charAt(index)) + 1));
			}
			
		}
		
		for (Map.Entry<Character, Integer> entry : mapData.entrySet()){

			if(entry.getValue() == 1) {
				uniqueCharater = entry.getKey();
				break;
			}
			
		}
		System.out.println(uniqueCharater);
	}

}
