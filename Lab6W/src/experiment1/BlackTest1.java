package experiment1;
import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Test;

public class BlackTest1 
{	@Test 
	public void TestExpression() throws IOException
	{	lab1 lab=new lab1();
		boolean result=lab.Expression("5+x*y");
		assertEquals(true,result);}}
