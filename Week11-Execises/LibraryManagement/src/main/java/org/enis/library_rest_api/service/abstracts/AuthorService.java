package org.enis.library_rest_api.service.abstracts;

import org.enis.library_rest_api.entities.Author;
import org.springframework.data.domain.Page;

public interface AuthorService {

    Author save(Author author);

    Author update(Author author);

    boolean delete(Long id);

    Author get(Long id);

    Page<Author> cursor(int page, int pageSize);
}
