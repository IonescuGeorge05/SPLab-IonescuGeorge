package ro.uvt.info.splabionescugeorge.commands;

import ro.uvt.info.splabionescugeorge.Author;
import ro.uvt.info.splabionescugeorge.Book;
import ro.uvt.info.splabionescugeorge.persistence.CrudRepository;

public class CommandContext {
    private final CrudRepository<Book, Integer> booksRepository;
    private final CrudRepository<Author, Integer> authorsRepository;

    public CommandContext(CrudRepository<Book, Integer> booksRepository, CrudRepository<Author, Integer> authorsRepository) {
        this.booksRepository = booksRepository;
        this.authorsRepository = authorsRepository;
    }

    public CrudRepository<Book, Integer> getBooksRepository() { return booksRepository; }
    public CrudRepository<Author, Integer> getAuthorsRepository() { return authorsRepository; }
}
