package com.example.webapp.controller;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.example.webapp.bean.DistrictBean;
import com.example.webapp.bean.TalukaBean;
import com.example.webapp.service.DistrictService;
import com.example.webapp.service.TalukaService;


@Controller
public class LoginRegistrationController {

	
	@Autowired
	private DistrictService dsService;
	@Autowired
	private TalukaService talukaService;
	
	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String loginPage1()
	{
		return "welcome";
	}
	
	@RequestMapping(value = "/login" , method = RequestMethod.GET)
	public String loginPage()
	{
		return "login";
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welcomePage(ModelMap model, @RequestParam(value = "emailId") String emailId,@RequestParam(value = "password") String password) {
		System.out.println(emailId+" "+password);
		List<DistrictBean> listEmp = dsService.districtlist();
		List<TalukaBean> listTaluka = talukaService.talukaList(1);
		Map dis=new HashMap();
		if(emailId.equals("mansi@gmail.com") && password.equals("123")) {
			for (int i=0;i<=listEmp.size()-1;i++) {
				System.out.println(listEmp.get(i).getName());
				dis.put(listEmp.get(i).getId(), listEmp.get(i).getName());
				model.addAttribute("district",listEmp.get(i).getName());
				//model.addAttribute("taluka",listEmp.get(i).getName());
			}
			 for (int i=0;i<=listTaluka.size()-1;i++) {
				  System.out.println(listTaluka.get(i).getName());
				  dis.put(listTaluka.get(i).getId(), listTaluka.get(i).getName());
				  model.addAttribute("taluka",listTaluka.get(i).getName());
			 }
			model.addAttribute("taluka","jhhjk");
			model.addAttribute("district",dis);
			return "Home";
		}
		model.put("error", "Please Input Correct emailId and password..");
		return "login";
	}
	
	/*@Autowired
	private TalukaService talukaService;
	@RequestMapping(value = "loadDisByTaluka/{id}", method = RequestMethod.GET)
	public String loadStatesByCountry(@PathVariable("id") long id,ModelMap model) {
		System.out.println("hello"+id);
		
		
		  List<TalukaBean> listTaluka = talukaService.talukaList(id); 
		  Map dis=new HashMap();
		  for (int i=0;i<=listTaluka.size()-1;i++) {
		  System.out.println(listTaluka.get(i).getName());
		  dis.put(listTaluka.get(i).getId(), listTaluka.get(i).getName());
		  model.addAttribute("taluka",listTaluka.get(i).getName());
		  }
		 // model.addAttribute("district", dis);
		  model.addAttribute("taluka",dis);
		  return "Home";
	}*/
	
	@RequestMapping(value = "/userDetails", method = RequestMethod.POST)
	public String userSave(ModelMap modelMap) throws IOException {
		
		modelMap.values();
		System.out.println(modelMap.values());
		
		/*byte [] byteArr=file.getBytes();
    	System.out.println(byteArr);
    	InputStream inputStream = new ByteArrayInputStream(byteArr);
    	
    	System.out.println(inputStream);
    	String encodedString = Base64.getEncoder().encodeToString(byteArr);
    	
    	System.out.println(encodedString);*/
		
		return "Home";
		
		
		
	}
	
}
