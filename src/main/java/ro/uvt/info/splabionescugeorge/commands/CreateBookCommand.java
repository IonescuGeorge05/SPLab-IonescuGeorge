package ro.uvt.info.splabionescugeorge.commands;

import ro.uvt.info.splabionescugeorge.Author;
import ro.uvt.info.splabionescugeorge.Book;

import java.util.List;

public class CreateBookCommand implements Command<Book> {
    private final CommandContext context;
    private final Book book;

    public CreateBookCommand(CommandContext context, Book book) {
        this.context = context;
        this.book = book;
    }

    public Book execute() {
        List<Author> authors = book.getAuthors();
        for (int i = 0; i < authors.size(); i++) {
            Integer authorId = authors.get(i).getId();
            if (authorId != null) {
                Author existing = context.getAuthorsRepository().findById(authorId)
                        .orElseThrow(() -> new IllegalArgumentException("Author not found: " + authorId));
                authors.set(i, existing);
            }
        }
        book.setId(null);
        return context.getBooksRepository().save(book);
    }
}
