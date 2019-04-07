package com.Retail.controller;

import java.util.List; 


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.RequestMapping;

import com.Retail.Beans.ProductBean;
import com.Retail.Proxy.ProductProxy;

@Controller
public class RetailController {
	
	
	@Autowired
	ProductProxy productProxy;
	
	@RequestMapping("/")
	public String index(Model model) {
		
		List<ProductBean> produits = productProxy.listeDesProduits();
		model.addAttribute("produits", produits);
		
		return "Acceuil";
	}

}
