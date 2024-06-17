package com.gyojincompany.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/board")
public class BoardController {
	@RequestMapping(value = "/gallery")
	public String gallery() {
		return "board/gallery";
	}
	@RequestMapping(value = "/free")
	public String free() {
		return "board/free";
	}
}
