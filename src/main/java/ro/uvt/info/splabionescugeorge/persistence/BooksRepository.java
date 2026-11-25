package ro.uvt.info.splabionescugeorge.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.info.splabionescugeorge.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
}
