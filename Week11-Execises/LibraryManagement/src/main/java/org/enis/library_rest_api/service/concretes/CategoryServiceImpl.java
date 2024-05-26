package org.enis.library_rest_api.service.concretes;

import lombok.RequiredArgsConstructor;
import org.enis.library_rest_api.entities.Category;
import org.enis.library_rest_api.repository.BookRepository;
import org.enis.library_rest_api.repository.CategoryRepository;
import org.enis.library_rest_api.service.abstracts.CategoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final BookRepository bookRepository;

    @Override
    public Category save(Category category) {
        return this.categoryRepository.save(category);
    }

    @Override
    public Category update(Category category) {
        this.get(category.getId());
        return this.categoryRepository.save(category);
    }

    @Override
    public String delete(Long id) {
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        if (optionalCategory.isPresent()) {
            Category category = optionalCategory.get();
            if (category.getBookList().isEmpty()) {
                categoryRepository.delete(category);
                return "Category deleted successfully";
            } else {
                return "Category has books";
            }
        }
        return "Category not found";
    }

    @Override
    public Category get(Long id) {
        return this.categoryRepository.findById(id).orElseThrow();
    }

    @Override
    public Page<Category> cursor(int page, int pageSize) {
        Pageable pageable = PageRequest.of(page, pageSize);
        return this.categoryRepository.findAll(pageable);
    }
}
