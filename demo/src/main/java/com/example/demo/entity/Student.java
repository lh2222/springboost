package com.example.demo.entity;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component// 将此javabean放入spring容器 
@ConfigurationProperties(prefix="student") // 通过这个注解绑定.yml或properties注入值 也可以用@Value注入值
public class Student {
	// @Value("ww")// 优先级低于配置文件里的（。yml或properties）
private String name;
private int age;
private boolean sex;
private Date birthday;
private Map<String,Object> location;
private String[] hobbies;
private List<String> skills;
private Pet pet;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public boolean isSex() {
	return sex;
}
public void setSex(boolean sex) {
	this.sex = sex;
}
public Date getBirthday() {
	return birthday;
}
public void setBirthday(Date birthday) {
	this.birthday = birthday;
}
public Map<String, Object> getLocation() {
	return location;
}
public void setLocation(Map<String, Object> location) {
	this.location = location;
}
public String[] getHobbies() {
	return hobbies;
}
public void setHobbies(String[] hobbies) {
	this.hobbies = hobbies;
}
public List<String> getSkills() {
	return skills;
}
public void setSkills(List<String> skills) {
	this.skills = skills;
}
public Pet getPet() {
	return pet;
}
public void setPet(Pet pet) {
	this.pet = pet;
}
@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", sex=" + sex + ", birthday=" + birthday + ", location="
			+ location + ", hobbies=" + Arrays.toString(hobbies) + ", skills=" + skills + ", pet=" + pet + "]";
}
}
