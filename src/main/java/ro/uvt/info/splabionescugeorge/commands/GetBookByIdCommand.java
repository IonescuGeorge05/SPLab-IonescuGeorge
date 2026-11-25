package ro.uvt.info.splabionescugeorge.commands;

import ro.uvt.info.splabionescugeorge.Book;

import java.util.Optional;

public class GetBookByIdCommand implements Command<Optional<Book>> {
    private final CommandContext context;
    private final Integer id;

    public GetBookByIdCommand(CommandContext context, Integer id) {
        this.context = context;
        this.id = id;
    }

    public Optional<Book> execute() { return context.getBooksRepository().findById(id); }
}
