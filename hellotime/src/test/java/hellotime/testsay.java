package hellotime;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class testsay {

	@Test
public void testsaytime() {
	
	hellotime shw=new hellotime();
	String result=shw.saytime("morning");
	assertEquals("Hello zs,morning",result);
}
}
