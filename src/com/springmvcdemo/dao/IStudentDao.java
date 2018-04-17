package com.springmvcdemo.dao;

import org.apache.ibatis.annotations.Insert;

import com.springmvcdemo.beans.Student;

public interface IStudentDao {

	@Insert("insert into student(name,age) values(#{name},#{age})")
	void insertStudent(Student student);

}
