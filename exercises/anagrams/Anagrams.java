import java.util.HashMap;

public class Anagrams {
    public static void main(String args[]) {
		String str1 = args[0], str2 = args[1];
        str1 = str1.replaceAll("[^\\w]", "").toLowerCase();
        str2 = str2.replaceAll("[^\\w]", "").toLowerCase();

		if (str1.length() != str2.length()) {
			System.out.println("Not Anagrams");
			return;
		}

        HashMap<Character, Integer> hashStr1 = getCharMap(str1);
		HashMap<Character, Integer> hashStr2 = getCharMap(str2);
        
		System.out.println(hashStr1.equals(hashStr2) ? "Anagrams" : "Not Anagrams");
    }

	private static HashMap<Character, Integer> getCharMap(String str) {
		HashMap<Character, Integer> hashStr = new HashMap();

		for(Character letter: str.toCharArray()) {
			if (hashStr.get(letter) == null) {
				hashStr.put(letter, 1);
				continue;
			}
			hashStr.put(letter, (int) hashStr.get(letter)+1);
		}

		return hashStr;
	}
}
