package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	public HashMap<String, String> dictionaryMap;
	
	public Dictionary_Chapter21() {
		dictionaryMap = new HashMap<>();
		initializeDictionary();
    }
	
	public void initializeDictionary() {
	dictionaryMap.put("apple","りんご");
	dictionaryMap.put("peach","桃");
	dictionaryMap.put("banana","バナナ");
	dictionaryMap.put("lemon","レモン");
	dictionaryMap.put("pear","梨");
	dictionaryMap.put("kiwi","キウイ");
	dictionaryMap.put("strawberry","いちご");
	dictionaryMap.put("grape","ぶどう");
	dictionaryMap.put("muscat","マスカット");
	dictionaryMap.put("cherry","さくらんぼ");
	}
	
	public void searchWords(String[] wordsToSearch) {
		for (String word : wordsToSearch) {
			if (dictionaryMap.containsKey(word)) {
				System.out.println(word + "の意味は" + dictionaryMap.get(word));
			} else {
				System.out.println(word + "は辞書に存在しません");
			}
		}
	}
		
}
