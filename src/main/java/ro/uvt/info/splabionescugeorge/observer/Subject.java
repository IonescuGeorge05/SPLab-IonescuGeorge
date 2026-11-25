package ro.uvt.info.splabionescugeorge.observer;

import ro.uvt.info.splabionescugeorge.Book;

public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers(Book book);
}
