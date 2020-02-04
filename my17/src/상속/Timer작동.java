package 상속;

import java.util.TimerTask;

public class Timer작동 extends TimerTask {

	@Override
	public void run() {
		System.out.println("게임이 종료되었습니다.");
		System.out.println("안녕히 가세요...");
	}

}
