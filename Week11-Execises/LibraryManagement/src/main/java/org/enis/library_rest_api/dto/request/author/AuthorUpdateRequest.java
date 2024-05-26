package org.enis.library_rest_api.dto.request.author;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorUpdateRequest {

    @Positive(message = "ID must be positive number")
    private Long id;

    @NotNull(message = "Author Name can't be null")
    private String name;

    private LocalDate birth_date;
    private String country;
}
