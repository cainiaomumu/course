package com.simplemumu.course.test.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * -- 项目名称 : @course
 * -- com.simplemumu.course.test
 * -- 类的作用 : public class TestController{ }
 * -- 创建时间 : 2019年8月3日
 * -- 创建人 : linguanbin
 * -- 用于测试的控制器
 */
@Controller
public class TestController {
	@RequestMapping("/index")
	public String index(){
		return "index.jsp";
	}
}

