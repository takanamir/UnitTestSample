package jp.co.bbreak.sokusen.test3.jmockit;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import mockit.Mocked;
import mockit.NonStrictExpectations;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
public class RandomAdderTest {
	// モックオブジェクトの生成
	@Mocked
	private RandomNumber mockRandNumber;

	@Test
	public void test() {
		RandomAdder rand = new RandomAdder();

		// getRandomNumber()の返り値を2と定義する
		new NonStrictExpectations() {
			{
				mockRandNumber.getRandomNumber();
				result = 2;
			}
		};

		assertThat(rand.add(), is(4));
	}
}