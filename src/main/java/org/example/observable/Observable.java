package org.example.observable;

import org.example.oberver.Observer;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 7/20/2023 15:50
 */

public interface Observable {

    void setNews(String news);

    void addCustomer(Observer observer);

    void removeCustomer(Observer observer);
}
