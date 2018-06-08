package com.wokao666.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.wokao666.entity.Student;
import com.wokao666.mappers.StudentMapper;

/**
 * 
 * The class Test.
 *
 * Description:编程方式使用mybatis
 *
 * @author: huangjiawei
 * @since: 2018年6月8日
 * @version: $Revision$ $Date$ $LastChangedBy$
 *
 */
public class Test {

	public static void main(String[] args) throws IOException {
		//	读取我们的配置文件
		InputStream input = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(input);

		// 打开一个会话session
		SqlSession session = factory.openSession();

		// 构建查询参数
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", 2);

		//	测试使用id获取一条记录
		Student stu = session.selectOne("getById", paramMap);
		System.err.println(stu.toString());

		// 测试使用命名空间查询一条记录（接口）
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		System.err.println(mapper.getById(paramMap));

		// 测试获取一个列表
		List<Student> stuList = session.selectList("listStudents");
		System.err.println(Arrays.toString(stuList.toArray()));

		System.err.println(mapper.get());
	}
}
