package org.enis.library_rest_api.controller;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.enis.library_rest_api.core.config.modelMapper.IModelMapperService;
import org.enis.library_rest_api.core.result.Result;
import org.enis.library_rest_api.core.result.ResultData;
import org.enis.library_rest_api.core.utils.ResultHelper;
import org.enis.library_rest_api.dto.request.book.BookSaveRequest;
import org.enis.library_rest_api.dto.request.book.BookUpdateRequest;
import org.enis.library_rest_api.dto.response.CursorResponse;
import org.enis.library_rest_api.dto.response.author.AuthorResponse;
import org.enis.library_rest_api.dto.response.book.BookResponse;
import org.enis.library_rest_api.entities.Author;
import org.enis.library_rest_api.entities.Book;
import org.enis.library_rest_api.entities.Publisher;
import org.enis.library_rest_api.service.abstracts.*;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;
    private final IModelMapperService modelMapperService;
    private final AuthorService authorService;
    private final CategoryService categoryService;
    private final BookBorrowingService bookBorrowingService;
    private final PublisherService publisherService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResultData<BookResponse> save(@Valid @RequestBody BookSaveRequest bookSaveRequest) {

        Book saveBook = this.modelMapperService.forRequest().map(bookSaveRequest, Book.class);
        Author author = this.authorService.get(bookSaveRequest.getAuthorId());
        saveBook.setAuthor(author);
        Publisher publisher = this.publisherService.get(bookSaveRequest.getPublisherId());
        saveBook.setPublisher(publisher);
        this.bookService.save(saveBook);

        return ResultHelper.created(this.modelMapperService.forResponse().map(saveBook, BookResponse.class));
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResultData<BookResponse> get(@PathVariable("id") Long id) {
        Book book = this.bookService.get(id);
        return ResultHelper.success(this.modelMapperService.forResponse().map(book, BookResponse.class));
    }

    @GetMapping("/{id}/author")
    @ResponseStatus(HttpStatus.OK)
    public ResultData<AuthorResponse> getAuthor(@PathVariable("id") Long id) {
        Book book = this.bookService.get(id);
        return ResultHelper.success(this.modelMapperService.forResponse().map(book.getAuthor(), AuthorResponse.class));
    }


    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResultData<CursorResponse<BookResponse>> cursor(
            @RequestParam(name = "page", required = false, defaultValue = "0") int page,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {

        Page<Book> bookPage = this.bookService.cursor(page, pageSize);
        Page<BookResponse> bookResponsePage = bookPage
                .map(book -> this.modelMapperService.forResponse().map(book, BookResponse.class));

        return ResultHelper.cursor(bookResponsePage);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResultData<BookResponse> update(@Valid @RequestBody BookUpdateRequest bookUpdateRequest) {
        Book updateBook = this.modelMapperService.forRequest().map(bookUpdateRequest, Book.class);
        this.bookService.update(updateBook);
        return ResultHelper.success(this.modelMapperService.forResponse().map(updateBook, BookResponse.class));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Result delete(@PathVariable("id") Long id) {
        this.bookService.delete(id);
        return ResultHelper.ok();
    }

}
