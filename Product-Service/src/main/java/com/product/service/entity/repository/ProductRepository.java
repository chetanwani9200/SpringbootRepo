package com.product.service.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.product.service.entity.ProdutEntity;

public interface ProductRepository extends JpaRepository<ProdutEntity,Integer> {
	

}
