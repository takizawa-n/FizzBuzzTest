package jp.alhinc.takizawa_naoko.fizzBuzz;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		assertThat(FizzBuzz.Answer(15), is("FizzBuzz"));
	}

	@Test
	public void test2() {
		assertThat(FizzBuzz.Answer(3), is("Fizz"));
	}

	@Test
	public void test3() {
		assertThat(FizzBuzz.Answer(5), is("Buzz"));
	}

	@Test
	public void test4() {
		assertThat(FizzBuzz.Answer(4), is("4"));
	}


}
