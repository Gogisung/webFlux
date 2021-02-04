package com.example.springWebflux.company.dao;

import com.example.springWebflux.company.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Gogisung
 * @since 2021-02-04
 */

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {


}
