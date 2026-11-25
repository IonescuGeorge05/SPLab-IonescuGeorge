package ro.uvt.info.splabionescugeorge.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.info.splabionescugeorge.Author;

@Repository
public interface AuthorsRepository extends JpaRepository<Author, Integer> {
}
