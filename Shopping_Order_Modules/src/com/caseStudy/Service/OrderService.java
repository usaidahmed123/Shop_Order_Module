package com.caseStudy.Service;

import com.caseStudy.Entities.OrderDetails;

public interface OrderService {
	
	
	public OrderDetails addOrder(OrderDetails orderDetails);
	public OrderDetails updateOrder(OrderDetails orderDetails);
	public OrderDetails searchOrder(int id);
	public boolean cancelMall(int id);
	//public Item addItem(Item item id);

}
