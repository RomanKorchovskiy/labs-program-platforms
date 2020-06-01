package com.labs.lab4;

import java.time.LocalDateTime;

public class Order {

  private final String name;
  private final String address;
  private final double price;
  private final int count;
  private boolean isPaid;

  private final LocalDateTime orderDateAndTime;

  public Order(
      String name, String address, double price, int count, LocalDateTime orderDateAndTime) {
    this.name = name;
    this.address = address;
    this.price = price;
    this.count = count;
    this.orderDateAndTime = orderDateAndTime;
    isPaid = false;
  }

  public Order(
      String name,
      String address,
      double price,
      int count,
      boolean isPaid,
      LocalDateTime orderDateAndTime) {
    this.name = name;
    this.address = address;
    this.price = price;
    this.count = count;
    this.isPaid = isPaid;
    this.orderDateAndTime = orderDateAndTime;
  }

  public boolean isPaid() {
    return isPaid;
  }

  public void setPaid(boolean paid) {
    isPaid = paid;
  }

  public boolean checkAddress(String address) {
    return this.address.toLowerCase().contains(address.toLowerCase());
  }

  public boolean checkAddress(String streetName, int buildingNumber) {
    return this.address.toLowerCase().contains(streetName.toLowerCase() + " " + buildingNumber);
  }

  public String getInfo() {
    return "Замовлення \""
        + name
        + "\": Адреса: "
        + address
        + "; Ціна: "
        + price
        + "; Кількість: "
        + count
        + "; Дата та час: "
        + orderDateAndTime
        + "; Оплачено: "
        + (isPaid ? "Так" : "Ні");
  }

  public String getInfo(int withoutPaidStatus) {
    return "Замовлення \""
        + name
        + "\": Адреса: "
        + address
        + "; Ціна: "
        + price
        + "; Кількість: "
        + count
        + "; Дата та час: "
        + orderDateAndTime
        + ";";
  }
}
