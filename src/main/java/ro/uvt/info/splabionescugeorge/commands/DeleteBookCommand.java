package ro.uvt.info.splabionescugeorge.commands;

public class DeleteBookCommand implements Command<Boolean> {
    private final CommandContext context;
    private final Integer id;

    public DeleteBookCommand(CommandContext context, Integer id) {
        this.context = context;
        this.id = id;
    }

    public Boolean execute() {
        if (!context.getBooksRepository().existsById(id)) {
            return false;
        }
        context.getBooksRepository().deleteById(id);
        return true;
    }
}
