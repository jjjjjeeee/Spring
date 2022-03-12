package com.campus.myapp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MappingController {
	// -- Get��� ������ ������
	// �������� url, a�±�, location.href, response.sendRedirect, meta, jstl-redirect�±�
	
	// url	->	http://localhost:9090/myapp/t1
	// a�±�	->	href="/myapp/t1"
	// ���1) -- Get���
	@RequestMapping("/t1")// ��ȯ���� String�̸� �����ϸ��� ��ȯ�Ѵ�.
	public ModelAndView test1(HttpServletRequest req) {
		int num = Integer.parseInt(req.getParameter("num"));
		String name = req.getParameter("name");
		
		System.out.println(num + ", "+name);
		
		// �𵨰� view�� ���� Ŭ����
		ModelAndView mav = new ModelAndView();
		// Ŭ���̾�Ʈ (��������)�� �������� ������ ������
		mav.addObject("num", num+100);
		mav.addObject("name", name+"��");
		mav.setViewName("main/result");		
		
		return mav; // WEB-INF/views/main/result.jsp
	}
	
	// ���2)
	@RequestMapping("/t2")
	public String test2(int num, String name, Model model) {
		System.out.println(num+"==="+name);
		model.addAttribute("num",num*2);
		model.addAttribute("name", name+"nim");
		return "main/result";
	}
	
	// ���3)
	@GetMapping("/t3")
	public ModelAndView test3(DataVO vo) {
		System.out.println(vo.getNum()+"-----"+vo.getName());
		
		// view�� ������
		ModelAndView mav = new ModelAndView();
		mav.addObject("vo", vo);
		mav.setViewName("main/result");
		
		return mav;
	}
	
	// ���4)
	@GetMapping("/t4")
	public String test4(@RequestParam("num")int num,@RequestParam("name")String name, Model model) {
		System.out.println(num+"<----->"+name);
		
		model.addAttribute("num", num);
		model.addAttribute("name", name);
		
		return "main/result";
		// ���� ������ ���ٰ� �ٽ� ������ �����ִ� �� Ȯ�� ����
	}
	
	// get���
	@RequestMapping(value="/form1", method=RequestMethod.GET)
	public ModelAndView form1(DataVO vo) {
		System.out.println("��ȣ=>"+vo.getNum());
		System.out.println("�̸�=>"+vo.getName());
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("vo",vo);
		mav.setViewName("main/result");
		
		return mav;
	}
	
	// post���
	// @RequestMapping(value="/form2", method=RequestMethod.POST)
	@PostMapping("/form2")
	public ModelAndView form2(DataVO vo) {
		System.out.println(vo.getNum()+"~~~~~~~~~~~~~"+vo.getName());
		ModelAndView mav = new ModelAndView();
		mav.addObject("vo",vo);
		mav.setViewName("main/result");
		
		return mav;
	}
}