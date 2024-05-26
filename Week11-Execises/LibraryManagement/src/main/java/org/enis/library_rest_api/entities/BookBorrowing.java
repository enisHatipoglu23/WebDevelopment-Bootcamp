package org.enis.library_rest_api.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "book_borrow")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_borrowing_id")
    private Long id;

    @Column(name = "book_borrower_name", nullable = false)
    private String borrowerName;

    @Column(name = "book_borrower_email")
    private String borrowerEmail;

    @Temporal(TemporalType.DATE)
    @Column(name = "book_borrowing_date")
    private LocalDate borrowingDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "book_return_date")
    private LocalDate returnDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "borrowing_book_id", referencedColumnName = "book_id")
    private Book book;


}
