package org.example.observable;

import org.example.oberver.Customer;
import org.example.oberver.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 7/20/2023 15:47
 */

public class Shop implements Observable {

    private String news;
    private List<Customer> customers;

    public Shop(){
        this.customers = new ArrayList<>();
    }

    @Override
    public void addCustomer(Observer customer){
        this.customers.add((Customer)customer);
    }

    @Override
    public void removeCustomer(Observer customer){
        this.customers.remove(customer);
    }

    @Override
    public void setNews(String news){
        this.news = news;
        for (Customer customer : customers){
            customer.update(news);
        }
    }

}
