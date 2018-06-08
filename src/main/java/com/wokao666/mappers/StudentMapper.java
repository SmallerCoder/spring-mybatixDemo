package com.wokao666.mappers;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.wokao666.entity.Student;

/**
 * 
 * The class StudentMapper.
 *
 * Description:学生mapper
 *
 * @author: huangjiawei
 * @since: 2018年6月7日
 * @version: $Revision$ $Date$ $LastChangedBy$
 *
 */
public interface StudentMapper {

	@Select("select * from Student where id=1")
	public Student get();

	public Student getById(Map<String, Object> param);

	public List<Student> listStudents();

}
