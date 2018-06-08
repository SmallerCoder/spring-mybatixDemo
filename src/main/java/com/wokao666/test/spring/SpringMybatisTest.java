package com.wokao666.test.spring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wokao666.entity.Student;
import com.wokao666.mappers.StudentMapper;

/**
 * 
 * The class SpringMybatisTest.
 *
 * Description:mybatis集成spring测试类
 *
 * @author: huangjiawei
 * @since: 2018年6月8日
 * @version: $Revision$ $Date$ $LastChangedBy$
 *
 */
public class SpringMybatisTest {

	private static ClassPathXmlApplicationContext ctx = null;

	public static void main(String[] args) {
		// 加载Spring配置文件
		ctx = new ClassPathXmlApplicationContext("mybatis-spring-config.xml");

		// 获取对应的bean
		StudentMapper studentMapper = ctx.getBean(StudentMapper.class);

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", 1);
		Student stu = studentMapper.getById(paramMap);
		System.err.println(stu.toString());
		List<Student> list = studentMapper.listStudents();
		System.err.println(Arrays.toString(list.toArray()));
	}
}
