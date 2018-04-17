package com.springmvcdemo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvcdemo.beans.Student;
import com.springmvcdemo.dao.IStudentDao;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {
	
	@Resource(name="IStudentDao")
	private IStudentDao dao;
	
	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}

	@Transactional
	public void addStudent(Student student) {
		dao.insertStudent(student);
	}

}
