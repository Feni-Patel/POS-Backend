package org.pgs.posback.repository;

import org.pgs.posback.model.SupplierProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierProductRepository extends JpaRepository<SupplierProductModel, Long> {
}
