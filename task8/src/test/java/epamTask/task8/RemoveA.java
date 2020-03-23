package epamTask.task8;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveA {

	/*TO DO List:
	 * "ABCD" => "BCD"
	 * "AACD" => "CD"
	 * "BBAA" => "BBAA"
	 * "AABAA" => "BAA"
	 */
	removeAinTwoChars rem;
	@BeforeEach
	void init() 
	{
		rem=new removeAinTwoChars();
	}
	@Test
	void testCase1()
	{
		assertEquals("BCD",rem.remove("ABCD"));
	}
	@Test
	void testCase2()
	{
		assertEquals("CD",rem.remove("AACD"));
	}
	@Test
	void testCase3()
	{
		assertEquals("BBAA",rem.remove("BBAA"));
	}
	@Test
	void testCase4()
	{
		assertEquals("BAA",rem.remove("AABAA"));
	}
	

}
