package com.tm.web;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.tm.dto.Student;
import com.tm.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	private String list(Model model) {
		List<Student> list = studentService.list();
		model.addAttribute("list", list);
		return "list";
	}

	// 通过id查找
	@RequestMapping(value = "/{id}/detail", method = RequestMethod.GET)
	private String detail(@PathVariable("id") Integer id, Model model) {
		if (id == null) {
			return "redirect:/student/list";
		}
		Student student = studentService.findById(id);
		if (student == null) {
			return "forward:/student/list";
		}
		model.addAttribute("student", student);
		return "detail";
	}

}
