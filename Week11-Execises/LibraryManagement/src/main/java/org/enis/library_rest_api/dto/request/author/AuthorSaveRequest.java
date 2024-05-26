package org.enis.library_rest_api.dto.request.author;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorSaveRequest {

    @NotNull(message = "Author Name can't be null")
    private String name;
    private LocalDate birthDate;
    private String country;
}
