package org.enis.library_rest_api.dto.request.book_borrowing;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowingSaveRequest {

    @NotNull(message = "Borrower Name musn't be null!")
    private String borrowerName;
    @Email
    private String borrowerEmail;
    private LocalDate borrowingDate;
    private LocalDate returnDate;
    private Long bookId;

}
