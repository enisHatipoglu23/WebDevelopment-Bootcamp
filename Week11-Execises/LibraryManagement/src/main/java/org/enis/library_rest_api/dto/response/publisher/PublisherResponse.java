package org.enis.library_rest_api.dto.response.publisher;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PublisherResponse {
    private Long id;
    private String name;
    private LocalDate establishmentYear;
}
