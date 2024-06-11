package org.enis.library_rest_api.service.concretes;

import lombok.RequiredArgsConstructor;
import org.enis.library_rest_api.repository.PublisherRepository;
import org.enis.library_rest_api.service.abstracts.PublisherService;
import org.enis.library_rest_api.core.exception.NotFoundException;
import org.enis.library_rest_api.core.utils.Message;
import org.enis.library_rest_api.entities.Publisher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PublisherServiceImpl implements PublisherService {
    private final PublisherRepository publisherRepository;

    @Override
    public Publisher save(Publisher publisher) {
        return this.publisherRepository.save(publisher);
    }

    @Override
    public Publisher update(Publisher publisher) {
        this.get(publisher.getId());
        return this.publisherRepository.save(publisher);
    }

    @Override
    public boolean delete(Long id) {
        Publisher publisher = this.get(id);
        this.publisherRepository.delete(publisher);
        return true;
    }

    @Override
    public Publisher get(Long id) {
        return this.publisherRepository.findById(id).orElseThrow(() -> new NotFoundException(Message.NOT_FOUND));
    }

    @Override
    public Page<Publisher> cursor(int page, int pageSize) {
        Pageable pageable = PageRequest.of(page, pageSize);
        return this.publisherRepository.findAll(pageable);
    }
}
