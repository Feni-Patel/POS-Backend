package org.pgs.posback.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.pgs.posback.dto.Category.CategoryRequestDTO;
import org.pgs.posback.dto.Category.CategoryResponseDTO;
import org.pgs.posback.model.CategoryModel;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    @Mapping(target = "id", source = "categoryModel.id")
    @Mapping(target = "name", source = "categoryModel.name")
    CategoryResponseDTO categoryModelToCategoryResponseDTO(CategoryModel categoryModel);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "name", source = "categoryRequestDTO.name")
    CategoryModel categoryRequestDTOToCategoryModel(CategoryRequestDTO categoryRequestDTO);
}

