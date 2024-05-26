package org.enis.library_rest_api.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.enis.library_rest_api.core.config.modelMapper.IModelMapperService;
import org.enis.library_rest_api.core.result.Result;
import org.enis.library_rest_api.core.result.ResultData;
import org.enis.library_rest_api.core.utils.ResultHelper;
import org.enis.library_rest_api.dto.request.book_borrowing.BookBorrowingSaveRequest;
import org.enis.library_rest_api.dto.request.book_borrowing.BookBorrowingUpdateRequest;
import org.enis.library_rest_api.dto.response.CursorResponse;
import org.enis.library_rest_api.dto.response.book_borrowing.BookBorrowingResponse;
import org.enis.library_rest_api.entities.Book;
import org.enis.library_rest_api.entities.BookBorrowing;
import org.enis.library_rest_api.service.abstracts.BookBorrowingService;
import org.enis.library_rest_api.service.abstracts.BookService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/borrows")
@RequiredArgsConstructor
public class BookBorrowingController {
    private final BookBorrowingService bookBorrowingService;
    private final BookService bookService;
    private final IModelMapperService modelMapperService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResultData<BookBorrowingResponse> save(@Valid @RequestBody BookBorrowingSaveRequest bookBorrowingSaveRequest) {

        BookBorrowing saveBookBorrowing = this.modelMapperService.forRequest().map(bookBorrowingSaveRequest, BookBorrowing.class);
        Book book = this.bookService.get(bookBorrowingSaveRequest.getBookId());
        saveBookBorrowing.setBook(book);
        this.bookBorrowingService.save(saveBookBorrowing);
        return ResultHelper.created(this.modelMapperService.forResponse().map(saveBookBorrowing, BookBorrowingResponse.class));
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResultData<BookBorrowingResponse> get(@PathVariable("id") Long id) {
        BookBorrowing bookBorrowing = this.bookBorrowingService.get(id);
        return ResultHelper.success(this.modelMapperService.forResponse().map(bookBorrowing, BookBorrowingResponse.class));
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResultData<CursorResponse<BookBorrowingResponse>> cursor(
            @RequestParam(name = "page", required = false, defaultValue = "0") int page,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {

        Page<BookBorrowing> bookBorrowingPage = this.bookBorrowingService.cursor(page, pageSize);
        Page<BookBorrowingResponse> bookBorrowingResponsePage = bookBorrowingPage
                .map(bookBorrowing -> this.modelMapperService.forResponse().map(bookBorrowing, BookBorrowingResponse.class));
        return ResultHelper.cursor(bookBorrowingResponsePage);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResultData<BookBorrowingResponse> update(@Valid @RequestBody BookBorrowingUpdateRequest bookBorrowingUpdateRequest) {
        BookBorrowing updateBookBorrowing = this.modelMapperService.forRequest().map(bookBorrowingUpdateRequest, BookBorrowing.class);
        this.bookBorrowingService.update(updateBookBorrowing);
        return ResultHelper.success(this.modelMapperService.forResponse().map(updateBookBorrowing, BookBorrowingResponse.class));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Result delete(@PathVariable("id") Long id) {
        this.bookBorrowingService.delete(id);
        return ResultHelper.ok();
    }

}
