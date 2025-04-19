package kadai_015;

public class Car_Chapter15 {
	// フィールド（内部データ）
    private int gear = 1; // 現在のギア
    private int speed = 10; // 現在の速度

    // 【メソッド】
    public void gearChange( int afterGear ) {
    	gear = afterGear; // 新しいギアに変更
    	speed = switch (gear) {
    	case 1 -> 10;
    	case 2 -> 20;
    	case 3 -> 30;
    	case 4 -> 40;
    	case 5 -> 50;
    	default -> 10;
    	};
       
        }
        
        public void run() {
        	System.out.println("ギア1から" + gear + "に切り替えました");
        	System.out.println("速度は時速" + speed + "kmです");
        	
    }
}