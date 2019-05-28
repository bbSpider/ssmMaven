package com.tm.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tm.base.BaseTest;
import com.tm.dto.Student;

public class studentDAOTest extends BaseTest {

	@Autowired
	private StudentDAO studentDao;

	/** 通过id查询 */
	@Test
	public void findById() {
		int id = 1;
		Student student = studentDao.findById(id);
		System.err.println(student);
	}

	/** 查询所有数据 */
	@Test
	public void list() {
		List<Student> list = studentDao.list(0, 100);
		for (Student stu : list) {
			System.err.println(stu);
		}
		// 同上结果一样
		// Student stu = null;
		// for(int i=0;i<list.size();i++) {
		// stu = list.get(i);
		// System.out.println(stu);
		// }
	}

	/** 删除 */
	@Test
	public void delete() {
		int id = 13;
		studentDao.delete(id);
		System.err.println(id);
	}

	/** 新增 */
	@Test
	public void insert() {
		Student student = new Student();
		student.setAge(19);
		student.setName("tm");
		studentDao.insert(student);
		System.err.println(student);
	}

	/** 修改 */
	@Test
	public void update() {
		Student student = new Student();
		student.setId(16);
		student.setAge(19);
		student.setName("tmm");
		studentDao.updateById(student);
		System.err.println(student);
	}
}
