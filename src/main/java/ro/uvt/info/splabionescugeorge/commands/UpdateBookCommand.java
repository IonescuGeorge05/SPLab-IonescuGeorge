package ro.uvt.info.splabionescugeorge.commands;

import ro.uvt.info.splabionescugeorge.Book;

import java.util.Optional;

public class UpdateBookCommand implements Command<Optional<Book>> {
    private final CommandContext context;
    private final Integer id;
    private final Book book;

    public UpdateBookCommand(CommandContext context, Integer id, Book book) {
        this.context = context;
        this.id = id;
        this.book = book;
    }

    public Optional<Book> execute() {
        if (!context.getBooksRepository().existsById(id)) {
            return Optional.empty();
        }
        book.setId(id);
        return Optional.of(context.getBooksRepository().save(book));
    }
}
