package com.caseStudy.Service;

import com.caseStudy.Entities.OrderDetails;
import com.caseStudy.Repository.OrderRepository;
import com.caseStudy.Repository.OrderRepositoryImpl;

public class OrderServiceImpl implements OrderService {
	
	
	private OrderRepository dao;
	

	public OrderServiceImpl() {
		dao = new OrderRepositoryImpl();
	}

	@Override
	public OrderDetails addOrder(OrderDetails orderDetails) {
		
		dao.beginTransaction();
		dao.addOrder(orderDetails);
		dao.commitTransaction();
		// TODO Auto-generated method stub
		return orderDetails;
	}

	@Override
	public OrderDetails updateOrder(OrderDetails orderDetails) {
		dao.beginTransaction();
		dao.updateOrder(orderDetails);
		dao.commitTransaction();
		// TODO Auto-generated method stub
		return orderDetails;
	}

	@Override
	public OrderDetails searchOrder(int id) {
		OrderDetails orderDetails = dao.searchOrder(id);
		// TODO Auto-generated method stub
		return orderDetails;
	}

	@Override
	public boolean cancelMall(int id) {
		dao.beginTransaction();
		dao.deleteOrder(id);
		dao.commitTransaction();
		// TODO Auto-generated method stub
		return false;
	}

	
}


