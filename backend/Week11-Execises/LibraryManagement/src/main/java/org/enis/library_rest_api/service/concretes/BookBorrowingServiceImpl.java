package org.enis.library_rest_api.service.concretes;

import lombok.RequiredArgsConstructor;
import org.enis.library_rest_api.repository.BookBorrowingRepository;
import org.enis.library_rest_api.repository.BookRepository;
import org.enis.library_rest_api.service.abstracts.BookBorrowingService;
import org.enis.library_rest_api.core.exception.NotFoundException;
import org.enis.library_rest_api.core.utils.Message;
import org.enis.library_rest_api.entities.Book;
import org.enis.library_rest_api.entities.BookBorrowing;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class BookBorrowingServiceImpl implements BookBorrowingService {
    private final BookBorrowingRepository bookBorrowingRepository;
    private final BookRepository bookRepository;

    @Override
    public BookBorrowing save(BookBorrowing bookBorrowing) {

        Book book = bookRepository.findById(bookBorrowing.getBook().getId()).orElseThrow(() -> new NotFoundException(Message.NOT_FOUND));
        if (book.getStock() > 0) {
            book.setStock(book.getStock() - 1);
            bookRepository.save(book);
            bookBorrowing.setBook(book);
            return this.bookBorrowingRepository.save(bookBorrowing);
        } else {
            throw new NotFoundException(Message.STOCK_NOT_ENOUGH);
        }
    }

    @Override
    public BookBorrowing update(BookBorrowing bookBorrowing) {
        bookBorrowing.setBorrowingDate(LocalDate.now());
        return this.bookBorrowingRepository.save(bookBorrowing);
    }

    @Override
    public boolean delete(Long id) {
        BookBorrowing bookBorrowing = this.get(id);
        this.bookBorrowingRepository.delete(bookBorrowing);
        return true;
    }

    @Override
    public BookBorrowing get(Long id) {
        return this.bookBorrowingRepository.findById(id).orElseThrow(() -> new NotFoundException(Message.NOT_FOUND));
    }

    @Override
    public Page<BookBorrowing> cursor(int page, int pageSize) {
        Pageable pageable = PageRequest.of(page, pageSize);
        return this.bookBorrowingRepository.findAll(pageable);
    }
}
