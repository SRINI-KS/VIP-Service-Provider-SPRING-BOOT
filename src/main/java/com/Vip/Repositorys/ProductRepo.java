package com.Vip.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Vip.Models.ProductModel;

public interface ProductRepo extends JpaRepository<ProductModel, Integer>{

}
