package com.sprin.crm.crmapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

import com.sprin.crm.crmapi.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
