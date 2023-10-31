package lab3a;
import org.junit.jupiter.api.Test;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class MovieTicketPriceCalculatorTest {
  private static final int STANDARD_PRICE_CENTS = 2700;
  private static final int MATINEE_PRICE_CENTS = 2400;
  private static final int CHILD_DISCOUNT_CENTS = 300;
  private static final int SENIOR_DISCOUNT_CENTS = 400;
  private final MovieTicketPriceCalculator mtpc = new MovieTicketPriceCalculator(LocalTime.of(6,0), LocalTime.of(10,0), 8, 65);

  @Test
  void noMatineeNoDiscount(){
    assertEquals(mtpc.computePrice(LocalTime.of(12, 0), 30), STANDARD_PRICE_CENTS);
  }
  
  @Test
  void noMatineeNoDiscountEarly(){
    assertEquals(mtpc.computePrice(LocalTime.of(2, 0), 30), STANDARD_PRICE_CENTS);
  }
  
  @Test
  void noMatineeChild(){
    assertEquals(mtpc.computePrice(LocalTime.of(12, 0), 1), STANDARD_PRICE_CENTS - CHILD_DISCOUNT_CENTS);
  }
  
  @Test
  void noMatineeChildExactAge(){
    assertEquals(mtpc.computePrice(LocalTime.of(12, 0), 8), STANDARD_PRICE_CENTS - CHILD_DISCOUNT_CENTS);
  }
  
  @Test
  void noMatineeSenior(){
    assertEquals(mtpc.computePrice(LocalTime.of(12, 0), 200), STANDARD_PRICE_CENTS - SENIOR_DISCOUNT_CENTS);
  }
  
  @Test
  void noMatineeSeniorExactAge(){
    assertEquals(mtpc.computePrice(LocalTime.of(12, 0), 65), STANDARD_PRICE_CENTS - SENIOR_DISCOUNT_CENTS);
  }
  
  @Test
  void matineeNoDiscount(){
    assertEquals(mtpc.computePrice(LocalTime.of(8, 0), 30), MATINEE_PRICE_CENTS);
  }
  
  @Test
  void matineeExactTimeNoDiscount(){
    assertEquals(mtpc.computePrice(LocalTime.of(6, 0), 30), MATINEE_PRICE_CENTS);
  }
  
  @Test
  void matineeChild(){
    assertEquals(mtpc.computePrice(LocalTime.of(8, 0), 1), MATINEE_PRICE_CENTS - CHILD_DISCOUNT_CENTS);
  }
  
  @Test
  void matineeSenior(){
    assertEquals(mtpc.computePrice(LocalTime.of(8, 0), 200), MATINEE_PRICE_CENTS - SENIOR_DISCOUNT_CENTS);
  }
}