package com.suitepagos.backend.models.services;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suitepagos.backend.models.entity.Profile;
import com.suitepagos.backend.models.entity.Users;
import com.suitepagos.backend.models.dao.IUserDao;

@Service
public class UserService implements IUserService, UserDetailsService{
    
    private Logger logger = LoggerFactory.getLogger(UserService.class);
    
    @Autowired
    private IUserDao userDao;
    
    @Override
    @Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        Users users = userDao.findByUsername(username);
        
        if(users == null) {
            logger.error("Error en el login: no existe el usuario '"+username+"' en el sistema!");
            throw new UsernameNotFoundException("Error en el login: no existe el usuario '"+username+"' en el sistema!");
        }
        
        List<GrantedAuthority> authorities = users.getProfileid().getRole()
                .stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .peek(authority -> logger.info("Role: " + authority.getAuthority()))
                .collect(Collectors.toList());

        return new User(users.getUsername(), users.getPassword(), users.getEnabled(), true, true, true, authorities);
    }
    
    @Override
    @Transactional(readOnly=true)
    public Users findByUsername(String username) {
        return userDao.findByUsername(username);
    }
    
    @Override
    @Transactional(readOnly=true)
    public Users findByUserId(Long userid){
        return userDao.findByUserId(userid);
    }

    @Override
	@Transactional(readOnly = true)
	public List<Users> findAll() {
		return userDao.findAll();
	}

    @Override
	@Transactional(readOnly = true)
	public Page<Users> findAll(Pageable pageable) {
		return userDao.findAll(pageable);
	}

    @Override
	@Transactional(readOnly = true)
	public Users findById(Long id) {
		return userDao.findById(id).orElse(null);
	}

    @Override
	@Transactional
	public Users save(Users user) {
		return userDao.save(user);
	}

    @Override
	@Transactional
	public void delete(Long id) {
		userDao.deleteById(id);
	}

    @Override
	@Transactional(readOnly = true)
	public List<Profile> findAllProfiles() {
		return userDao.findAllProfiles();
	}
    
}
