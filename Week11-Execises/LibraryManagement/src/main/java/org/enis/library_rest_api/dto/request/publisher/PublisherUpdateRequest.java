package org.enis.library_rest_api.dto.request.publisher;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PublisherUpdateRequest {

    @Positive
    private Long id;
    @NotNull(message = "Publisher name musn't be null!")
    private String name;
    private LocalDate establishmentYear;
    private String address;

}
