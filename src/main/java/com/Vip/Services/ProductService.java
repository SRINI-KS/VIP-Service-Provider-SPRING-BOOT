package com.Vip.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vip.Models.ProductModel;
import com.Vip.Repositorys.ProductRepo;


@Service
public class ProductService {

	@Autowired
	private ProductRepo propertyDataDao;
	
	public List<ProductModel> listProp() {
		return this.propertyDataDao.findAll();
		
	}

}
