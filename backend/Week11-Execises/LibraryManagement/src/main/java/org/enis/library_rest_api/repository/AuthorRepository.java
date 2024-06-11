package org.enis.library_rest_api.repository;
        ;

        import org.enis.library_rest_api.entities.Author;
        import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
