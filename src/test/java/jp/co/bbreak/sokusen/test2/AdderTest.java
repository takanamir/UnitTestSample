package jp.co.bbreak.sokusen.test2;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class AdderTest {
	@Test
	public void testCase() {
		Adder adder = new Adder();
		int result = adder.add(1, 2);

		// 計算結果の比較
		assertEquals(result, 3);
	}

	@Test
	public void testCase2() {
		Adder adder = new Adder();
		int result = adder.add(1, 2);

		// 計算結果の比較
		assertNotEquals(result, 2);
	}

	@Test
	public void testCase3() {
		Adder adder = new Adder();
		int result = adder.add(1, 2);

		// 計算結果の比較
		assertThat(result, is(3));
	}

	@Ignore
	@Test
	public void testCaseFail() {
		Adder adder = new Adder();
		int result = adder.add(1, 2);

		// 計算結果の比較
		assertEquals(result, 2);
	}
}