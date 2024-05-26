package org.enis.library_rest_api.controller;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.enis.library_rest_api.core.config.modelMapper.IModelMapperService;
import org.enis.library_rest_api.core.result.Result;
import org.enis.library_rest_api.core.result.ResultData;
import org.enis.library_rest_api.core.utils.ResultHelper;
import org.enis.library_rest_api.dto.request.category.CategorySaveRequest;
import org.enis.library_rest_api.dto.request.category.CategoryUpdateRequest;
import org.enis.library_rest_api.dto.response.CursorResponse;
import org.enis.library_rest_api.dto.response.category.CategoryResponse;
import org.enis.library_rest_api.entities.Category;
import org.enis.library_rest_api.service.abstracts.CategoryService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    private final IModelMapperService modelMapperService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResultData<CategoryResponse> save(@Valid @RequestBody CategorySaveRequest categorySaveRequest) {

        Category saveCategory = this.modelMapperService.forRequest().map(categorySaveRequest, Category.class);
        this.categoryService.save(saveCategory);
        return ResultHelper.created(this.modelMapperService.forResponse().map(saveCategory, CategoryResponse.class));
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResultData<CategoryResponse> get(@PathVariable("id") Long id) {
        Category category = this.categoryService.get(id);
        return ResultHelper.success(this.modelMapperService.forResponse().map(category, CategoryResponse.class));
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResultData<CursorResponse<CategoryResponse>> cursor(
            @RequestParam(name = "page", required = false, defaultValue = "0") int page,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {

        Page<Category> categoryPage = this.categoryService.cursor(page, pageSize);
        Page<CategoryResponse> categoryResponsePage = categoryPage
                .map(category -> this.modelMapperService.forResponse().map(category, CategoryResponse.class));

        return ResultHelper.cursor(categoryResponsePage);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResultData<CategoryResponse> update(@Valid @RequestBody CategoryUpdateRequest categoryUpdateRequest) {
        Category updateCategory = this.modelMapperService.forRequest().map(categoryUpdateRequest, Category.class);
        this.categoryService.update(updateCategory);
        return ResultHelper.success(this.modelMapperService.forResponse().map(updateCategory, CategoryResponse.class));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Result delete(@PathVariable("id") Long id) {
        this.categoryService.delete(id);
        return ResultHelper.ok();
    }
}
