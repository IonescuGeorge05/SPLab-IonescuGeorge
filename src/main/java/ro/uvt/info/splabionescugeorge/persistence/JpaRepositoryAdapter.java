package ro.uvt.info.splabionescugeorge.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public class JpaRepositoryAdapter<T, ID> implements CrudRepository<T, ID> {
    private final JpaRepository<T, ID> jpaRepository;

    public JpaRepositoryAdapter(JpaRepository<T, ID> jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    public List<T> findAll() { return jpaRepository.findAll(); }
    public Optional<T> findById(ID id) { return jpaRepository.findById(id); }
    public T save(T entity) { return jpaRepository.save(entity); }
    public boolean existsById(ID id) { return jpaRepository.existsById(id); }
    public void deleteById(ID id) { jpaRepository.deleteById(id); }
}
