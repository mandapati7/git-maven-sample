package test;

import org.junit.Assert;
import org.junit.Test;


public class TestMain {
	
	@Test
	public void testMessage() {
		Greetings g = new Greetings();
		Assert.assertTrue("Hello".equals(g.getMsg()));
	}
	
}
