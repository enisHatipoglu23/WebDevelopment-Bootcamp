package org.enis.library_rest_api.service.abstracts;

import org.enis.library_rest_api.entities.BookBorrowing;
import org.springframework.data.domain.Page;

public interface BookBorrowingService {
    BookBorrowing save(BookBorrowing bookBorrowing);

    BookBorrowing update(BookBorrowing bookBorrowing);

    boolean delete(Long id);

    BookBorrowing get(Long id);

    Page<BookBorrowing> cursor(int page, int pageSize);
}
