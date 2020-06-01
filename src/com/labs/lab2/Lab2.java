package com.labs.lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab2 {

  public static void main(String[] args) throws IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Введіть преше число: ");
    float num1 = Float.parseFloat(input.readLine());
    System.out.print("Введіть друге число: ");
    float num2 = Float.parseFloat(input.readLine());
    if (num1 == 0 || num2 == 0) {
      System.out.println("Ви ввели одне (або два) ненульове (-их) число (-ел)!");
      return;
    }
    num1 *= num1;
    num2 *= num2;
    float sum = num1 + num2;
    float subtraction = num1 - num2;
    float mul = num1 * num2;
    float fraction = num1 % num2;
    System.out.println("Сума: " + sum);
    System.out.println("Різниця: " + subtraction);
    System.out.println("Добуток: " + mul);
    System.out.println("Остача: " + fraction);
  }
}
