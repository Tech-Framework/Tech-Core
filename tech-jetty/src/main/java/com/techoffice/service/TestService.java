package com.techoffice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techoffice.criteria.TestCriteria;
import com.techoffice.dao.TestDao;
import com.techoffice.entity.Test;
import com.techoffice.key.TestKey;

@Service
public class TestService{
	
	@Autowired
	private TestDao testDao;
	
	public List<Test> search(TestCriteria testCriteria){
		return testDao.search(testCriteria);
	}
	
	public Test find(TestKey testKey){
		return testDao.find(testKey);
	}
	
	public int insert(Test test){
		return testDao.insert(test);
	}
	
	public int update(Test test){
		return testDao.update(test);
	}
	
	public int delete(TestKey testKey){
		return testDao.delete(testKey);
	}
}