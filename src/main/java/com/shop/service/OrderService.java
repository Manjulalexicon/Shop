package com.shop.service;

import com.shop.model.Customer;
import com.shop.model.Order;
import com.shop.model.Product;

public class OrderService {

    public Order createOrder(Customer customer) {
        Order order = new Order(customer);
        customer.addOrder(order);
        return order;
    }

    public void addProductToOrder(Order order, Product product, int quantity) {
        order.addProduct(product, quantity);
    }

    public void printOrderSummary(Order order) {
        System.out.println("Order ID: " + order.getOrderId());

        order.getItems().forEach(item -> {
            System.out.println(item.getProduct().getName() +
                    " x " + item.getQuantity() +
                    " = " + item.getTotalPrice());
        });

        System.out.println("Total: " + order.calculateTotal());
    }
}