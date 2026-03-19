package com.shop;

import com.shop.model.*;
import com.shop.service.OrderService;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("C1", "Manjula");

        Product p1 = new Product("P1", "Laptop", 1000);
        Product p2 = new Product("P2", "Mouse", 50);

        OrderService service = new OrderService();

        Order order = service.createOrder(customer);

        service.addProductToOrder(order, p1, 1);
        service.addProductToOrder(order, p2, 2);

        service.printOrderSummary(order);
    }
}