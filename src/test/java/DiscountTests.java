import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DiscountTests {

  DiscountService service = new DiscountService();

  @Test
  void shouldReturn0IfSumIs900() {
    int sum = 900;
    int expected = 0;
    int actual = service.discountCalc(sum);

    assertEquals(expected, actual);
  }

  @Test
  void shouldReturn50IfSumIs1000() {
    int sum = 1000;
    int expected = 50;
    int actual = service.discountCalc(sum);

    assertEquals(expected, actual);
  }

  @Test
  void shouldReturn100IfSumIs2000() {
    int sum = 2000;
    int expected = 100;
    int actual = service.discountCalc(sum);

    assertEquals(expected, actual);
  }

  @Test
  void shouldReturn1000IfSumIs15000() {
    int sum = 15000;
    int expected = 1000;
    int actual = service.discountCalc(sum);

    assertEquals(expected, actual);
  }

}
