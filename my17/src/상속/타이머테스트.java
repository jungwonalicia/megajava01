package 상속;

import java.util.Timer;

public class 타이머테스트 {

	public static void main(String[] args) {
		//타임이 끝나고 나서 작동을 어떻게 할지 정의
		Timer작동 time작동 = new Timer작동();
		//타이머 필요
		Timer timer = new Timer();
		System.out.println("5초동안 게임을 할 수 있습니다.");
		timer.schedule(time작동, 5000);
	}
}
