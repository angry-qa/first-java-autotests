package main;

import test.Test;

public class Main {

  public static void main(String[] args) {
    Test test = new Test();

    test.checkSum(900, 0);
    test.checkSum(1000, 50);
    test.checkSum(2000, 100);
    test.checkSum(15000, 1000);
  }
}
