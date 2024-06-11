package org.enis.library_rest_api.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "publisher")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id")
    private Long id;

    @Column(name = "publisher_name", nullable = false)
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "publisher_establishment_year")
    private LocalDate establishmentYear;

    @Column(name = "publisher_address")
    private String address;

    @OneToMany(mappedBy = "publisher")
    private List<Book> bookList;
}
