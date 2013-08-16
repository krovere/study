package kr.co.itpe;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
	 
@RequestMapping("/sample")
@Controller(value = "mainController")
public class MainController {
	@RequestMapping(value = "/main")
    public String hello(ModelMap model) throws Exception {
    	return "main";
    }
}
