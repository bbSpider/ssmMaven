package com.tm.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tm.base.BaseTest;
import com.tm.dto.Student;

public class StudentServiceTest extends BaseTest {

	@Autowired
	private StudentService studentService;

	/** 新增 */
	@Test
	public void insert() {
		Student student = new Student();
		student.setAge(100);
		student.setName("1111");
		studentService.insert(student);
		System.err.println(student);
	}

	/** 删除 */
	@Test
	public void delete() {
		int id = 12;
		studentService.delete(id);
		System.err.println(id);
	}

	/** 修改 */
	@Test
	public void update() {
		Student student = new Student();
		student.setId(15);
		student.setAge(100);
		student.setName("1111");
		studentService.update(student);
		System.err.println(student);
	}

	/** 通过id查找 */
	@Test
	public void findById() {
		Student student = studentService.findById(1);
		System.out.println(student);
	}

	/** 查询 */
	@Test
	public void list() {
		List<Student> list = studentService.list();
		for (Student stu : list) {
			System.err.println(stu);
		}
	}

}
