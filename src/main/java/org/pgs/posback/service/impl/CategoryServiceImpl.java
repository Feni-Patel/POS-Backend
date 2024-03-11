package org.pgs.posback.service.impl;

import org.pgs.posback.dto.Category.CategoryRequestDTO;
import org.pgs.posback.dto.Category.CategoryResponseDTO;
import org.pgs.posback.mapper.CategoryMapper;
import org.pgs.posback.model.CategoryModel;
import org.pgs.posback.repository.CategoryRepository;
import org.pgs.posback.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryResponseDTO> getAllCategories() {
        List<CategoryModel> categories = categoryRepository.findAll();
        return categories.stream()
                .map(CategoryMapper.INSTANCE::categoryModelToCategoryResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryResponseDTO getCategoryById(Long id) {
        Optional<CategoryModel> categoryData = categoryRepository.findById(id);
        return categoryData.map(CategoryMapper.INSTANCE::categoryModelToCategoryResponseDTO).orElse(null);
    }

    @Override
    public CategoryResponseDTO createCategory(CategoryRequestDTO categoryRequestDTO) {
        CategoryModel categoryModel = CategoryMapper.INSTANCE.categoryRequestDTOToCategoryModel(categoryRequestDTO);
        CategoryModel createdCategory = categoryRepository.save(categoryModel);
        return CategoryMapper.INSTANCE.categoryModelToCategoryResponseDTO(createdCategory);
    }

    @Override
    public CategoryResponseDTO updateCategory(Long categoryId, CategoryRequestDTO categoryRequestDTO) {
        Optional<CategoryModel> categoryData = categoryRepository.findById(categoryId);
        if (categoryData.isPresent()) {
            CategoryModel categoryModel = CategoryMapper.INSTANCE.categoryRequestDTOToCategoryModel(categoryRequestDTO);
            categoryModel.setId(categoryId); // Ensure the ID is set for update
            CategoryModel updatedCategory = categoryRepository.save(categoryModel);
            return CategoryMapper.INSTANCE.categoryModelToCategoryResponseDTO(updatedCategory);
        } else {
            return null; // or throw an exception
        }
    }

    @Override
    public void deleteCategory(Long categoryId) {
        categoryRepository.deleteById(categoryId);
    }
}


