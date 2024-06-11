package org.enis.library_rest_api.service.abstracts;
import org.enis.library_rest_api.entities.Publisher;
import org.springframework.data.domain.Page;

public interface PublisherService {

    Publisher save(Publisher publisher);

    Publisher update(Publisher publisher);

    boolean delete(Long id);

    Publisher get(Long id);

    Page<Publisher> cursor(int page, int pageSize);
}
