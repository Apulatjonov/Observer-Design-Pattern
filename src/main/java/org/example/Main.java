package org.example;

import org.example.oberver.Customer;
import org.example.oberver.Observer;
import org.example.observable.Observable;
import org.example.observable.Shop;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 7/20/2023 15:47
 */
public class Main {
    public static void main(String[] args) {
        Observable shop = new Shop();
        Observer customer1 = new Customer("John");
        Observer customer2 = new Customer("Sam");

        shop.addCustomer(customer1);
        shop.addCustomer(customer2);

        shop.setNews("New product available!");
    }
}