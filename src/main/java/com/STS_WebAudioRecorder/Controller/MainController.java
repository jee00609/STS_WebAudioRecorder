package com.STS_WebAudioRecorder.Controller;

import javax.servlet.http.*;
import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

@Controller
public class MainController {


//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String index(Model model) {
//
//		return "index";
//	}
	
	// 도서관 소개 페이지
	@GetMapping("/")
	public String index() {
		return "index";
	}


//	// 도서관 소개 페이지
//	@GetMapping("/library_introduce")
//	public String library_introduce() {
//		return "library_introduce";
//	}

}