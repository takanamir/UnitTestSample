package jp.co.bbreak.sokusen.test3.jmockit;

import java.util.Random;

public class RandomNumber {
	public int getRandomNumber() {
		Random rand = new Random();

		// 10以下の整数をランダムで返す
		return rand.nextInt(10);
	}
}