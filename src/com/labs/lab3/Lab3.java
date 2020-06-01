package com.labs.lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab3 {

  public static void main(String[] args) throws IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Введіть число A: ");
    int a = Integer.parseInt(input.readLine());
    System.out.print("Введіть друге B: ");
    int b = Integer.parseInt(input.readLine());
    if (a >= b) {
      System.out.println("Числа не задовільняють умову А < B");
      return;
    }
    // while
    int result = 1;
    int i = a;
    while (i <= b) {
      result *= i;
      i++;
    }
    System.out.println("While результат: " + result);

    // do - while
    result = 1;
    i = a;
    do {
      result *= i;
      i++;
    } while (i <= b);
    System.out.println("Do-while результат: " + result);

    // for
    result = 1;
    for (i = a; i <= b; i++) {
      result *= i;
    }
    System.out.println("For результат: " + result);
  }
}
