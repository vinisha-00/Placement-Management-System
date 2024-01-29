package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller1 {
	@Autowired
	PlacementDAO pla;
	@RequestMapping("home")	
	public ModelAndView homepage(@RequestParam("name") String str) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("websitename",str);
		mv.setViewName("home.jsp");
		
		return mv;        
		
	}
	@RequestMapping("addStudent")
	public ModelAndView addUser(StudentPlacementDetail stud) {
		
		ModelAndView mv=new ModelAndView() ;
			mv.addObject("studentDetails",stud);
			mv.setViewName("added.jsp");
			pla.save(stud);
			return mv;
			
		}
	@RequestMapping("viewStudent")
	public ModelAndView display(StudentPlacementDetail stud) {
		Optional<StudentPlacementDetail> op=pla.findById(stud.getRollNo());
		StudentPlacementDetail student=op.get();
		ModelAndView mv=new ModelAndView() ;
		mv.addObject("studentDetails",student);
		mv.setViewName("display.jsp");
		return mv;
		
	}
	@RequestMapping("deleteStudent")
	public ModelAndView delete(StudentPlacementDetail stud) {
		ModelAndView mv=new ModelAndView() ;
		pla.deleteById(stud.getRollNo());
		mv.addObject("studentDetails",stud);
		mv.setViewName("delete.jsp");
		//studentdao.delete(stud);
		return mv;
	}	
	@RequestMapping("updateStudent")
	 public ModelAndView updateuser(StudentPlacementDetail stud) {
	ModelAndView mv = new ModelAndView();
	pla.findById(stud.getRollNo());
pla.deleteById(stud.getRollNo());
	mv.addObject("StudentDetails",stud);
		mv.setViewName("update.jsp");
		
		return mv;
		
	}

}
