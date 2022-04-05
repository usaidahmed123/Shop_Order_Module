package com.caseStudy.Repository;

import javax.persistence.EntityManager;

import com.caseStudy.Entities.OrderDetails;

public class OrderRepositoryImpl implements OrderRepository{
	
	
	//Starting JPA Life Cycle
	private EntityManager entityManager;
	
	
	public OrderRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public OrderDetails addOrder(OrderDetails orderDetails) {
		
		entityManager.persist(orderDetails);
		// TODO Auto-generated method stub
		return orderDetails;
	}

	@Override
	public OrderDetails updateOrder(OrderDetails orderDetails) {
		
		entityManager.merge(orderDetails);
		// TODO Auto-generated method stub
		return orderDetails;
	}

	@Override
	public OrderDetails searchOrder(int id) {
		OrderDetails orderDetails =entityManager.find(OrderDetails.class, id);
		// TODO Auto-generated method stub
		return orderDetails;
	}

	@Override
	public boolean deleteOrder(int id) {
		OrderDetails orderDetails =entityManager.find(OrderDetails.class, id);
		entityManager.remove(orderDetails);
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void beginTransaction() {
		
		entityManager.getTransaction().begin();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commitTransaction() {
		
		entityManager.getTransaction().commit();
		// TODO Auto-generated method stub
		
	}

}
