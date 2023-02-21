package com.Vip.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vip.Models.ProductModel;
import com.Vip.Services.ProductService;


@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class ProductController {
	@Autowired
	ProductService propDataService;
	@GetMapping("listProperty")
	public List<ProductModel> listProp() {
		return propDataService.listProp();
		
	}

}
