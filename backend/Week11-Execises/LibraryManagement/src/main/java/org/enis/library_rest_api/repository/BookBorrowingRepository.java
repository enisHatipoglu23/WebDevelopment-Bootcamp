package org.enis.library_rest_api.repository;

import org.enis.library_rest_api.entities.BookBorrowing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookBorrowingRepository extends JpaRepository<BookBorrowing, Long> {
}
