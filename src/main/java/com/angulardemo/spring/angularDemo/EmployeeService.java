package com.angulardemo.spring.angularDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	public List<Employee> getEmployees() {
		List<Employee> employeeBeans = new ArrayList<>();
		Employee empBean = new Employee(); // Long.valueOf(101), "Sachin", 41
		empBean.setId(Long.valueOf(101));
		empBean.setName("Sachin");
		empBean.setAge(41);

		Employee empBean1 = new Employee(); // Long.valueOf(101), "Sachin", 41
		empBean1.setId(Long.valueOf(102));
		empBean1.setName("Sunder");
		empBean1.setAge(26);

		Employee empBean2 = new Employee(); // Long.valueOf(101), "Sachin", 41
		empBean2.setId(Long.valueOf(103));
		empBean2.setName("Rishabh");
		empBean2.setAge(23);

		Employee empBean3 = new Employee(); // Long.valueOf(101), "Sachin", 41
		empBean3.setId(Long.valueOf(104));
		empBean3.setName("Yuvi");
		empBean3.setAge(38);
		
		employeeBeans.add(empBean);
		employeeBeans.add(empBean1);
		employeeBeans.add(empBean2);
		employeeBeans.add(empBean3);
		

		return employeeBeans;

	}

}
