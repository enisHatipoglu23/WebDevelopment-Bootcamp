package org.enis.library_rest_api.dto.response.book;

import lombok.*;
import org.enis.library_rest_api.entities.Category;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookResponse {

    private Long id;
    private String name;
    private LocalDate publicationYear;
    private int stock;
    private Long authorId;
    private Long publisherId;
    private List<Category> categoryList;
}
