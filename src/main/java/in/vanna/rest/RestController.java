package in.vanna.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import in.vanna.binding.Employee;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@GetMapping("/")
	public List<Employee> employeeDTLS() {
		List<Employee> l=new ArrayList<>();
		for(int i=0;i<100;i++) {
			l.add(new Employee());
		}
		return l;
	}
}
