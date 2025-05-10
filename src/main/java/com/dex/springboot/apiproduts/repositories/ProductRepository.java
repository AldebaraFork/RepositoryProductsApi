package com.dex.springboot.apiproduts.repositories;

import com.dex.springboot.apiproduts.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
//é necessario passar a entidade que esse repositorio usa, e o identificador que a mesma entidade usa
@Repository //é um bean que informa ao spring que essa clase fara transações com a base de dados (CRUD)
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {

}
