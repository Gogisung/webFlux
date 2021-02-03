package com.example.springWebflux.company.dao;

import com.example.springWebflux.company.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyRepository extends JpaRepository<Company, Long> {


}
