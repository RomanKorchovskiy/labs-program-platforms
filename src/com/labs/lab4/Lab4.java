package com.labs.lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

public class Lab4 {

  public static void main(String[] args) throws IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    Order[] orders = new Order[10];

    orders[0] = new Order("Піца 'Цезаре'", "Наукова 81", 338, 2, true, LocalDateTime.now());
    orders[1] = new Order("Салат 'Цезар'", "Наукова 81", 150, 1, true, LocalDateTime.now());
    orders[2] = new Order("Курка гриль", "Наукова 41", 100, 1, LocalDateTime.now());
    orders[3] = new Order("Нагетси", "Зелена 11", 59, 6, LocalDateTime.now());
    orders[4] = new Order("Бургер", "Чорновола 110", 120, 2, LocalDateTime.now());
    orders[5] = new Order("Чізбургер", "Чороновола 110", 40, 1, LocalDateTime.now());
    orders[6] = new Order("Чіпси 'Lays'", "Вужа 15", 21, 1, LocalDateTime.now());
    orders[7] = new Order("Сухарики 'Flint'", "Вузька 44", 15, 1, true, LocalDateTime.now());
    orders[8] = new Order("Coca Cola", "Патона 2", 15, 1, LocalDateTime.now());
    orders[9] = new Order("Fanta", "Широка 13", 15, 1, LocalDateTime.now());

    // Оплачені замовлення
    System.out.println("Оплачені замовлення:");
    for (Order order : orders) {
      if (order.isPaid()) {
        System.out.println(order.getInfo());
      }
    }

    // Неоплачені замовлення
    System.out.println();
    System.out.println("Неоплачені замовлення:");
    for (Order order : orders) {
      if (!order.isPaid()) {
        System.out.println(order.getInfo());
      }
    }
    System.out.println();

    // Пошук за адресою
    System.out.print("Введіть частину назви вулиці: ");
    String street = input.readLine();
    for (Order order : orders) {
      if (order.checkAddress(street)) {
        System.out.println(order.getInfo());
      }
    }
  }
}
