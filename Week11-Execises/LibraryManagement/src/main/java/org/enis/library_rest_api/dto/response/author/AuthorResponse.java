package org.enis.library_rest_api.dto.response.author;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorResponse {

    private Long id;
    private String name;
    private LocalDate birthDate;
    private String country;
}
