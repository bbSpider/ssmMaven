package com.tm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tm.dto.Student;

public interface StudentDAO {

	/** 新增 */
	void insert(Student student);

	/** 删除 */
	void delete(Integer id);

	/** 修改 */
	void updateById(Student student);

	/** 通过id查找 */
	Student findById(Integer id);

	/**
	 * 查询
	 * 
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return
	 */
	List<Student> list(@Param("offset") int offset, @Param("limit") int limit);

}
