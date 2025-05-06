package com.dex.springboot.apiproduts.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

//Necessário para crias as TABELAS na base de dados
@Entity
@Table(name = "TB_PRODUCTS")
public class ProductModel implements Serializable {

    //PROPRIEDADES ou COLUNAS dessas tabelas
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //não é necessario INICIAR um valor para esse ID
    private UUID id; //UUID é um Identificar distribuido, não sequencial, universais e que podem ser gerados em qualquer lugar

    private String nome;

    private BigDecimal preco;

    private static final long serialVersionUID = 1L;
}
