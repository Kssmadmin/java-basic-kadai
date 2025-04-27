package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	// 自分のじゃんけんの手を入力するメソッド
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
				String myChoice;
		
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			myChoice = scanner.nextLine();
			
			switch(myChoice) {
			case "r":
			case "s":
			case "p":
				return myChoice;
			default:
				System.out.println("無効な選択です。もう一度入力してください。");
			}
		}
	}
	
	
	// 対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		String[] hands = {"r", "s", "p"};
		int randomIndex = (int) Math.floor(Math.random() * 3);
		return hands[randomIndex];
	}
	
	// じゃんけんを行うメソッド
	public void playGame() {
		HashMap<String, String> handMap = new HashMap<>();
		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");
		
		String myChoice = getMyChoice();
		String random = getRandom();
		
		System.out.println("自分の手は" + handMap.get(myChoice) + ",対戦相手の方は" + handMap.get(random));
		
		if (myChoice.equals(random)) {
			System.out.println("あいこです。");
		} else if ((myChoice.equals("r") && random.equals("s")) || (myChoice.equals("s") && random.equals("p")) || (myChoice.equals("p") && random.equals("r"))) {
			System.out.println("自分の勝ちです。");
		} else {
			System.out.println("自分の負けです。");
		}
	}
		
}
