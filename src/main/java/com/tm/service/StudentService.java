package com.tm.service;

import java.util.List;

import com.tm.dto.Student;

public interface StudentService {
	/** 新增 */
	void insert(Student student);

	/** 删除 */
	void delete(Integer id);

	/** 修改 */
	void update(Student student);

	/** 通过id查找 */
	Student findById(Integer id);

	/** 查询 */
	List<Student> list();

}
