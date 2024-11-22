package com.suitepagos.backend.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suitepagos.backend.models.dao.IModuleConfigDao;
import com.suitepagos.backend.models.entity.ModuleConfig;

@Service
public class ModuleConfigImpl implements IModuleConfigService {
    
    @Autowired
    private IModuleConfigDao mc;
    
    @Override
    @Transactional(readOnly = true)
    public List<ModuleConfig> findAll() {
        return mc.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public ModuleConfig findById(Long id) {
        return mc.findById(id).orElse(null);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<ModuleConfig> findByIdList(Long id) {
        return mc.findByIdList(id);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<ModuleConfig> findModuleByCompany(Long id) {
        return mc.findModuleByCompany(id);
    }
    
    @Override
    @Transactional(readOnly = true)
    public String existModuleCompany(Long moduleid, Long companyid) {
        return mc.existModuleCompany(moduleid, companyid);
    }

    @Override
    @Transactional
    public ModuleConfig save(ModuleConfig moduleConfig) {
        return mc.save(moduleConfig);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        mc.deleteById(id);
    }

}