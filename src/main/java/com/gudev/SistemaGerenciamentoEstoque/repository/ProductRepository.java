package com.gudev.SistemaGerenciamentoEstoque.repository;

import com.gudev.SistemaGerenciamentoEstoque.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
