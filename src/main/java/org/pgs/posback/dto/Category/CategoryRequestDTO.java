package org.pgs.posback.dto.Category;

import lombok.Data;
import org.pgs.posback.model.ProductModel;

import java.util.Date;
import java.util.List;

@Data
public class CategoryRequestDTO {

    private Long id;

    private String name;

    private List<ProductModel> products;

    private Date createdAt;

    private Date updatedAt;

}
