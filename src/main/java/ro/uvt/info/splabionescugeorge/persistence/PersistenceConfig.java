package ro.uvt.info.splabionescugeorge.persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.uvt.info.splabionescugeorge.Author;
import ro.uvt.info.splabionescugeorge.Book;

@Configuration
public class PersistenceConfig {

    @Bean
    public CrudRepository<Book, Integer> booksCrudRepository(BooksRepository booksRepository) {
        return new JpaRepositoryAdapter<>(booksRepository);
    }

    @Bean
    public CrudRepository<Author, Integer> authorsCrudRepository(AuthorsRepository authorsRepository) {
        return new JpaRepositoryAdapter<>(authorsRepository);
    }
}
