package JunitTest;

import java.nio.channels.AsynchronousServerSocketChannel;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

	@Test
	public void showTest()
	{
		App app = new App();
		String str = app.show();
		Assert.assertEquals("message", str);
	}
	
	@Test
	public void addTest()
	{
		App app = new App();
		int result = app.add(10, 20);
		Assert.assertEquals(30, result);
	}
	
	@Test
	public void doGetTest1()
	{
		App app = new App();
		String result = app.doGet("pratik", "123");
		Assert.assertEquals("pratik", result);
	}
	
	@Test
	public void doGetTest2()
	{
		App app = new App();
		String result = app.doGet("pratk", "123");
		Assert.assertEquals("pratk", result);
	}
	
	@Test
	public void deGetTest3()
	{
		App app = new App();
		String result = app.doGet(" ", "123");
		Assert.assertEquals(" ", result);
	}
	
}
