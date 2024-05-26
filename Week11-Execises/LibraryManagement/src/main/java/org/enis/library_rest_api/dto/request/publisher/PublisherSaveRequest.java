package org.enis.library_rest_api.dto.request.publisher;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PublisherSaveRequest {

    @NotNull(message = "Publisher Name can't be null!")
    private String name;

    private LocalDate establishmentYear;
    private String address;
}
