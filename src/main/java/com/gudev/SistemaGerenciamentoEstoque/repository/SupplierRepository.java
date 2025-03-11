package com.gudev.SistemaGerenciamentoEstoque.repository;

import com.gudev.SistemaGerenciamentoEstoque.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
