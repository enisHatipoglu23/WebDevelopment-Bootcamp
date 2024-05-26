package org.enis.library_rest_api.service.abstracts;
import org.enis.library_rest_api.entities.Category;
import org.springframework.data.domain.Page;

public interface CategoryService {

    Category save(Category category);

    Category update(Category category);

    String delete(Long id);

    Category get(Long id);

    Page<Category> cursor(int page, int pageSize);
}
