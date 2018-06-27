package com.briup.apps.poll.service;

import java.util.List;


import com.briup.apps.poll.bean.extend.OptionsVM;

public interface IOptionsService {
	
	List<OptionsVM> findAllOptionsVM() throws Exception;

}
