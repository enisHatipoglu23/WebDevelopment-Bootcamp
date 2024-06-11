package org.enis.library_rest_api.dto.request.book;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.enis.library_rest_api.entities.Category;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookSaveRequest {

    @NotNull(message = "Book name musn't be null!")
    private String name;
    private LocalDate publicationYear;
    private int stock;
    private Long authorId;
    private Long publisherId;
    private List<Category> categoryList;


}
