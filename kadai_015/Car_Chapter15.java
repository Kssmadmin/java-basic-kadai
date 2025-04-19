package kadai_015;

public class Car_Chapter15 {
	// フィールド（内部データ）
    private int    gear = 1;
    private int    speed = 10;

    // コンストラクタ（初期化処理）
    public Car_Chapter15( int gear , int speed ) {
        this.gear  = gear;
        this.speed = speed;

    }

    // 【メソッド】
    public void gearChange( int afterGear ) {
        
        if( this.gear == 3 ) {
            System.out.println( "ギア1から" + this.gear + "に切り替えました" );
            return;
        }
    }
        
        public void run() {
        	speed = switch (gear) {
        	case 1 -> 10;
        	case 2 -> 20;
        	case 3 -> 30;
        	case 4 -> 40;
        	case 5 -> 50;
        	default -> 10;
        	};
        	
        	System.out.println("速度は時速" + speed + "kmです");
        	
    }
}