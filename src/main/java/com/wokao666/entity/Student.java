package com.wokao666.entity;

/**
 * 
 * The class Student.
 *
 * Description:学生实体类
 *
 * @author: huangjiawei
 * @since: 2018年6月7日
 * @version: $Revision$ $Date$ $LastChangedBy$
 *
 */
public class Student {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String name;
	private String address;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(int id, String name, String address, int age) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public Student() {
	}
}
