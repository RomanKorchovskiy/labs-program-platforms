package com.labs.lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

public class Lab1 {

  public static void main(String[] args) throws IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Привіт, як тебе звати?");
    String name = input.readLine();
    System.out.println("Привіт, " + name + "! А який у тебе вік?");
    int age = Integer.parseInt(input.readLine());
    System.out.println("Твій рік народження: " + (LocalDateTime.now().getYear() - age));
  }
}
