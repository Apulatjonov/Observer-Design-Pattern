package org.example.oberver;

import org.example.observable.Observable;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 7/20/2023 15:48
 */

public class Customer implements Observer {

    private String news;
    private String name;

    public Customer(String name){
        this.name = name;
    }

    @Override
    public void update(String news) {
        this.news = news;
        System.out.println("News updated in " + this.name + " : " + this.news);
    }
}
