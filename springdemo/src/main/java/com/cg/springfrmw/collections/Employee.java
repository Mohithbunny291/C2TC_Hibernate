package com.cg.springfrmw.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

	private String employeeName;
	private List<String> employeePhoneList;
	private Set<String> employeeAddressSet;
	private Map<String, String> coursesMap;
	private Properties props;
	
	
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public List<String> getEmployeePhoneList() {
		return employeePhoneList;
	}
	public void setEmployeePhoneList(List<String> employeePhoneList) {
		this.employeePhoneList = employeePhoneList;
	}
	public Set<String> getEmployeeAddressSet() {
		return employeeAddressSet;
	}
	public void setEmployeeAddressSet(Set<String> employeeAddressSet) {
		this.employeeAddressSet = employeeAddressSet;
	}
	public Map<String, String> getCoursesMap() {
		return coursesMap;
	}
	public void setCoursesMap(Map<String, String> coursesMap) {
		this.coursesMap = coursesMap;
	}
	
	
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeePhoneList=" + employeePhoneList
				+ ", employeeAddressSet=" + employeeAddressSet + ", coursesMap=" + coursesMap + ", props=" + props
				+ "]";
	}
	
	
}
