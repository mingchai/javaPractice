import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {
  Counter counter; // declares counter for testing

  @BeforeEach
  public void setup(){
    counter = new Counter(); // initializes counter before each test method below
  }

  @Test
  public void testIncrement() {
    // count starts at 0
    assertTrue(this.counter.increment() == 1);
    // call again - should be 2
    assertTrue(this.counter.increment() == 2);
    
    this.counter.increment();
    assertFalse(this.counter.getCount() == 2, "should not return 2 after calling increment a third time");

  }

  @Test
  public void testDecrement() {
    counter.increment(); // Increment to avoid negative count
    assertEquals(0, counter.decrement());
    assertEquals(-1, counter.decrement());
  }

  @Test
  public void testGetCount() {
    counter.increment();
    counter.increment();
    assertEquals(2, counter.getCount());
  }

  @Test
  public void testReset() {
    counter.increment();
    counter.increment();
    counter.reset();
    assertEquals(0, counter.getCount());
  }
}