package com.kodewala.Zepto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.Zepto.bean.ProductBean;
import com.kodewala.Zepto.dao.ProductDAO;
import com.kodewala.Zepto.entity.ProductEntity;
import com.kodewala.Zepto.exception.ProductNotFoundException;

@Service
public class ProductService {

	@Autowired
	ProductDAO productDAO;

	public void addProduct(ProductBean productBean) {

		System.out.println("I am service");

		ProductEntity productEntity = new ProductEntity();

		productEntity.setProductName(productBean.getProductName());
		productEntity.setDescription(productBean.getDescription());
		productEntity.setQty(productBean.getQty());
		productEntity.setPrice(productBean.getPrice());

		productDAO.saveProduct(productEntity);

	}

	public List<ProductEntity> searchProduct(String name) {
		System.out.println(name);
		List<ProductEntity> products = productDAO.searchProduct(name);

		
		return products;
	}

}
