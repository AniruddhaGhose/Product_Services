package com.ps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ps.entity.Registration;
import com.ps.repository.RegDao;
@Service
public class RegServicesImpl implements RegServices {

	@Autowired
	private RegDao regDao;
	
	@Override
	@Transactional
	public Registration addReg(Registration reg) {
		
		return regDao.save(reg);
	}

}
