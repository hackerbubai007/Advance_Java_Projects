package com.kodewala.Zepto.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kodewala.Zepto.entity.ProductEntity;
import com.kodewala.Zepto.exception.ProductNotFoundException;

@Repository
public class ProductDAO {

	@Autowired
	SessionFactory sessionFactory;

	public void saveProduct(ProductEntity productEntity) {

		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();

		session.save(productEntity);

		txn.commit();

		System.out.println("i am product dao");

	}

	public List<ProductEntity> searchProduct(String searchString) {
		System.out.println("ProductDAO - searchProduct(): " + searchString);
		Session session = sessionFactory.openSession();
		List<ProductEntity> list = session
				.createQuery("FROM ProductEntity WHERE productName LIKE :name", ProductEntity.class)
				.setParameter("name", "%" + searchString + "%").list();
		session.close();
		System.out.println("Search results: " + list);

		if (list.isEmpty() || list == null) {

			throw new ProductNotFoundException("Product Not Found");
		} else {
			return list;

		}

	}


}
