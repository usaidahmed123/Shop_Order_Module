package com.caseStudy.Repository;

import com.caseStudy.Entities.OrderDetails;

public interface OrderRepository {
	
	
	public OrderDetails addOrder(OrderDetails orderDetails);
	public OrderDetails updateOrder(OrderDetails orderDetails);
	public OrderDetails searchOrder(int id);
	public boolean deleteOrder(int id);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
	
	

}
