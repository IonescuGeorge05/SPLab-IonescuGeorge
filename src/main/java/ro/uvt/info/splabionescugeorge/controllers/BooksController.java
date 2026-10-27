package ro.uvt.info.splabionescugeorge.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.uvt.info.splabionescugeorge.Author;
import ro.uvt.info.splabionescugeorge.Book;
import ro.uvt.info.splabionescugeorge.commands.CommandContext;
import ro.uvt.info.splabionescugeorge.commands.CreateBookCommand;
import ro.uvt.info.splabionescugeorge.commands.DeleteBookCommand;
import ro.uvt.info.splabionescugeorge.commands.GetAllBooksCommand;
import ro.uvt.info.splabionescugeorge.commands.GetBookByIdCommand;
import ro.uvt.info.splabionescugeorge.commands.UpdateBookCommand;
import ro.uvt.info.splabionescugeorge.persistence.CrudRepository;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final CommandContext context;

    public BooksController(CrudRepository<Book, Integer> booksRepository, CrudRepository<Author, Integer> authorsRepository) {
        this.context = new CommandContext(booksRepository, authorsRepository);
    }

    @GetMapping
    public List<Book> getAll() {
        return new GetAllBooksCommand(context).execute();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getById(@PathVariable Integer id) {
        return ResponseEntity.of(new GetBookByIdCommand(context, id).execute());
    }

    @PostMapping
    public ResponseEntity<Book> create(@RequestBody Book book) {
        Book created = new CreateBookCommand(context, book).execute();
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> update(@PathVariable Integer id, @RequestBody Book book) {
        return ResponseEntity.of(new UpdateBookCommand(context, id, book).execute());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (new DeleteBookCommand(context, id).execute()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> badRequest(IllegalArgumentException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
