package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class forrmcontroller {
@GetMapping("notes")

public String Notes()
{
	return "notes";
}

@PostMapping("/detail")
public String viewdetails(@RequestParam("cid")  String cid,
		@RequestParam("cname")String cname,
		@RequestParam("cemail")String cemail, ModelMap modelmap
		
		)
{ 
	modelmap.put("cid", cid);
	modelmap.put("cname", cname);
	modelmap.put("cemail", cemail);
	return "viewcustomer";
}
}
