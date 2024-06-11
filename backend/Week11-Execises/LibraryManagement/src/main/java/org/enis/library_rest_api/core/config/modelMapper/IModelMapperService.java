package org.enis.library_rest_api.core.config.modelMapper;

import org.modelmapper.ModelMapper;

public interface IModelMapperService {

    ModelMapper forRequest();

    ModelMapper forResponse();
}
