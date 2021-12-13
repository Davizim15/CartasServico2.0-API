package com.codata.CartasdeServicos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codata.CartasdeServicos.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{



}
