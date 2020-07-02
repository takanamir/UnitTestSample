package jp.co.bbreak.sokusen.test3.jmockit;

public class RandomAdder {
	public int add() {
		RandomNumber rand = new RandomNumber();
		int a = rand.getRandomNumber();
		int b = rand.getRandomNumber();

		// 2つの乱数値の和を返す
		return a + b;
	}
}