package main;

public class DiscountService {

  public int discountCalc(int sum) {
    int discount = 0;

    if (sum > 1000 && sum <= 5000) {
      discount = (int)(sum * 0.05);
    }  else  if (sum > 5000) {
      discount = (int)(sum * 0.1);
    }

    if (discount > 1000) {
      return 1000;
    }

    return discount;
  }

}
