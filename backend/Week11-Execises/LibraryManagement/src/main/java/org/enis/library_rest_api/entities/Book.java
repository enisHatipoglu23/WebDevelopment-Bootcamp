package org.enis.library_rest_api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;

    @Column(name = "book_name", nullable = false)
    private String name;

    @Column(name = "book_publication_year")
    private LocalDate publicationYear;

    @Column(name = "book_stock")
    private int stock;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_publisher_id", referencedColumnName = "publisher_id")
    private Publisher publisher;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_author_id", referencedColumnName = "author_id")
    private Author author;

    @OneToMany(mappedBy = "book")
    private List<BookBorrowing> bookBorrowingList;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "book_category", joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> categoryList;

}
