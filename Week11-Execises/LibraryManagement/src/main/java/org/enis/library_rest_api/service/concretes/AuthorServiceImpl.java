package org.enis.library_rest_api.service.concretes;

import lombok.RequiredArgsConstructor;
import org.enis.library_rest_api.repository.AuthorRepository;
import org.enis.library_rest_api.service.abstracts.AuthorService;
import org.enis.library_rest_api.core.exception.NotFoundException;
import org.enis.library_rest_api.core.utils.Message;
import org.enis.library_rest_api.entities.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;


    @Override
    public Author save(Author author) {
        return this.authorRepository.save(author);
    }

    @Override
    public Author update(Author author) {
        this.get(author.getId());
        return this.authorRepository.save(author);
    }

    @Override
    public boolean delete(Long id) {
        Author author = this.get(id);
        this.authorRepository.delete(author);
        return true;
    }

    @Override
    public Author get(Long id) {
        return this.authorRepository.findById(id).orElseThrow(() -> new NotFoundException(Message.NOT_FOUND));
    }

    @Override
    public Page<Author> cursor(int page, int pageSize) {
        Pageable pageable = PageRequest.of(page, pageSize);
        return this.authorRepository.findAll(pageable);
    }
}
