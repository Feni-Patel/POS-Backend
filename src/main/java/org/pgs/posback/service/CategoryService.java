package org.pgs.posback.service;

import org.pgs.posback.dto.Category.CategoryRequestDTO;
import org.pgs.posback.dto.Category.CategoryResponseDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryResponseDTO> getAllCategories();
    CategoryResponseDTO getCategoryById(Long id);
    CategoryResponseDTO createCategory(CategoryRequestDTO categoryRequestDTO);
    CategoryResponseDTO updateCategory(Long categoryId, CategoryRequestDTO categoryRequestDTO);
    void deleteCategory(Long categoryId);
}

