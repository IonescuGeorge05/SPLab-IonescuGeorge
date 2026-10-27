package ro.uvt.info.splabionescugeorge.commands;

import ro.uvt.info.splabionescugeorge.Book;

import java.util.List;

public class GetAllBooksCommand implements Command<List<Book>> {
    private final CommandContext context;

    public GetAllBooksCommand(CommandContext context) { this.context = context; }

    public List<Book> execute() { return context.getBooksRepository().findAll(); }
}
