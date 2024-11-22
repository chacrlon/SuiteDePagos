package com.suitepagos.backend.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suitepagos.backend.models.entity.Company;

public interface ICompanyDao extends JpaRepository<Company, Long>{

}
