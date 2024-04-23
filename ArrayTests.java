import static org.junit.Assert.*;
import org.junit.*;


public class ArrayTests {

	@Test 
	public void testReverseInPlace() {
    int[] input1 = {3,2,1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{1,2,3}, input1);
	}

  @Test
  public void testReversedNonEmpty() {
    int[] input1 = {1,2};
    assertArrayEquals(new int[]{2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowestEmpty(){
    double[] input1 = { };
    assertEquals(Double.valueOf(0.0), Double.valueOf(ArrayExamples.averageWithoutLowest(input1)));
  }

  @Test
  public void testAverageWithoutLowestOne(){
    double[] input1 = { 2.0 };
    assertEquals(Double.valueOf(0.0), Double.valueOf(ArrayExamples.averageWithoutLowest(input1)));
  }

  @Test
  public void testAverageWithoutLowestRepeat(){
    double[] input1 = { 1.0, 2.5, 1.0, 4.0, 1.5 };
    assertEquals(Double.valueOf(2.0), Double.valueOf(ArrayExamples.averageWithoutLowest(input1)));
  }

  @Test
  public void testAverageWithoutLowestNorm(){
    double [] input1 = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
    assertEquals(Double.valueOf(4.0), Double.valueOf(ArrayExamples.averageWithoutLowest(input1)));
  }
}
