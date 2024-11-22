package com.suitepagos.backend.models.services;

import java.util.List;

import com.suitepagos.backend.models.entity.ModuleConfig;

public interface IModuleConfigService {
    
    public List<ModuleConfig> findAll();
    
    public ModuleConfig findById(Long id);
    
    public List<ModuleConfig> findByIdList(Long id);
    
    public List<ModuleConfig> findModuleByCompany(Long id);
    
    public String existModuleCompany(Long moduleid, Long companyid);
    
    public ModuleConfig save(ModuleConfig moduleConfig);
    
    public void delete(Long id);
    
}