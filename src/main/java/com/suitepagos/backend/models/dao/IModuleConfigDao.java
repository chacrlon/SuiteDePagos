package com.suitepagos.backend.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.suitepagos.backend.models.entity.ModuleConfig;

public interface IModuleConfigDao extends JpaRepository<ModuleConfig, Long> {
    
    @Query(value = "SELECT * from module_config where moduleid=?1 ", nativeQuery = true)
    public List<ModuleConfig> findByIdList(Long id);
    
    @Query(value = "select * from module_config mc where NOT EXISTS (select 1 from company_module cm, company c where cm.moduleid = mc.moduleid and c.companyid = cm.companyid and c.companyid =?1)", nativeQuery = true)
    public List<ModuleConfig> findModuleByCompany(Long id);
 
    @Query(value = "SELECT 1 from company_module where moduleid=?1 and companyid=?2", nativeQuery = true)
    public String existModuleCompany(Long moduleid, Long companyid);
}