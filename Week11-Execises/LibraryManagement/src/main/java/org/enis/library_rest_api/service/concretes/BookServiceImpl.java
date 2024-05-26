package org.enis.library_rest_api.service.concretes;

import lombok.RequiredArgsConstructor;
import org.enis.library_rest_api.repository.BookRepository;
import org.enis.library_rest_api.service.abstracts.BookService;
import org.enis.library_rest_api.core.exception.NotFoundException;
import org.enis.library_rest_api.core.utils.Message;
import org.enis.library_rest_api.entities.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return this.bookRepository.save(book);
    }

    @Override
    public Book update(Book book) {
        this.get(book.getId());
        return this.bookRepository.save(book);
    }

    @Override
    public boolean delete(Long id) {
        Book book = this.get(id);
        this.bookRepository.delete(book);
        return true;
    }

    @Override
    public Book get(Long id) {
        return this.bookRepository.findById(id).orElseThrow(() -> new NotFoundException(Message.NOT_FOUND));
    }

    @Override
    public Page<Book> cursor(int page, int pageSize) {
        Pageable pageable = PageRequest.of(page, pageSize);
        return this.bookRepository.findAll(pageable);
    }
}
