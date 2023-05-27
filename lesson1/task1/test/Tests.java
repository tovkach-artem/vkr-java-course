import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {

  @Test
  public void testSolution() {
    assertEquals("На экран должна быть выведена фраза 'Привет, Java'",
        "Привет, Java", Task.sayHello());
  }
}