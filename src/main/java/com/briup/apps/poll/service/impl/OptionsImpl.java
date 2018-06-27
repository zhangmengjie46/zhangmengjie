package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.extend.OptionsVM;
import com.briup.apps.poll.dao.extend.OptionsVMMapper;
import com.briup.apps.poll.service.IOptionsService;

@Service

public class OptionsImpl implements IOptionsService {
	
	@Autowired
	private OptionsVMMapper optionsVMMapper;

	@Override
	public List<OptionsVM> findAllOptionsVM() throws Exception {
		
		return optionsVMMapper.selectAll();
	}

}
