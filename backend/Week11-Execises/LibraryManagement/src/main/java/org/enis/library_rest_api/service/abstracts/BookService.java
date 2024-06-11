package org.enis.library_rest_api.service.abstracts;

import org.enis.library_rest_api.entities.Book;
import org.springframework.data.domain.Page;

public interface BookService {

    Book save(Book book);

    Book update(Book book);

    boolean delete(Long id);

    Book get(Long id);

    Page<Book> cursor(int page, int pageSize);
}
