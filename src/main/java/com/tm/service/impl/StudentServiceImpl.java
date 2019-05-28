package com.tm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tm.dao.StudentDAO;
import com.tm.dto.Student;
import com.tm.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	// 注入service依赖
	@Autowired
	private StudentDAO studentDao;

	/** 新增 */
	@Override
	public void insert(Student student) {
		studentDao.insert(student);
	}

	/** 删除 */
	@Override
	public void delete(Integer id) {
		studentDao.delete(id);
	}

	/** 修改 */
	@Override
	public void update(Student student) {
		studentDao.updateById(student);

	}

	/** 通过id查找 */
	@Override
	public Student findById(Integer id) {
		return studentDao.findById(id);
	}

	/** 查询 */
	@Override
	public List<Student> list() {
		return studentDao.list(0, 100);// 查询从0开始，到第100条
	}
}
