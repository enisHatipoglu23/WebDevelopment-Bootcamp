package org.enis.library_rest_api.dto.request.book_borrowing;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowingUpdateRequest {

    @Positive(message = "Book Borrowing ID must be positive!")
    private Long id;

    @NotNull(message = "Borrowe Name musn't be null!")
    private String borrowerName;

    private LocalDate borrowingDate;
    private LocalDate returnDate;
}
