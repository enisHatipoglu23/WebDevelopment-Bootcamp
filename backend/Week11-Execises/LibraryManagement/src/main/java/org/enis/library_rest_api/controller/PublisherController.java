package org.enis.library_rest_api.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.enis.library_rest_api.service.abstracts.PublisherService;
import org.enis.library_rest_api.core.config.modelMapper.IModelMapperService;
import org.enis.library_rest_api.core.result.Result;
import org.enis.library_rest_api.core.result.ResultData;
import org.enis.library_rest_api.core.utils.ResultHelper;
import org.enis.library_rest_api.dto.request.publisher.PublisherSaveRequest;
import org.enis.library_rest_api.dto.request.publisher.PublisherUpdateRequest;
import org.enis.library_rest_api.dto.response.CursorResponse;
import org.enis.library_rest_api.dto.response.publisher.PublisherResponse;
import org.enis.library_rest_api.entities.Publisher;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/publishers")
@RequiredArgsConstructor
public class PublisherController {

    private final PublisherService publisherService;
    private final IModelMapperService modelMapperService;



    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResultData<PublisherResponse> save(@Valid @RequestBody PublisherSaveRequest publisherSaveRequest) {

        Publisher savePublisher = this.modelMapperService.forRequest().map(publisherSaveRequest, Publisher.class);
        this.publisherService.save(savePublisher);
        return ResultHelper.created(this.modelMapperService.forResponse().map(savePublisher, PublisherResponse.class));
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResultData<PublisherResponse> get(@PathVariable("id") Long id) {
        Publisher publisher = this.publisherService.get(id);
        return ResultHelper.success(this.modelMapperService.forResponse().map(publisher, PublisherResponse.class));
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResultData<CursorResponse<PublisherResponse>> cursor(
            @RequestParam(name = "page", required = false, defaultValue = "0") int page,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {

        Page<Publisher> publisherPage = this.publisherService.cursor(page, pageSize);
        Page<PublisherResponse> publisherResponsePage = publisherPage
                .map(publisher -> this.modelMapperService.forResponse().map(publisher, PublisherResponse.class));

        return ResultHelper.cursor(publisherResponsePage);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResultData<PublisherResponse> update(@Valid @RequestBody PublisherUpdateRequest publisherUpdateRequest) {
        Publisher updatePublisher = this.modelMapperService.forRequest().map(publisherUpdateRequest, Publisher.class);
        this.publisherService.update(updatePublisher);
        return ResultHelper.created(this.modelMapperService.forResponse().map(updatePublisher, PublisherResponse.class));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Result delete(@PathVariable("id") Long id) {
        this.publisherService.delete(id);
        return ResultHelper.ok();
    }

}
