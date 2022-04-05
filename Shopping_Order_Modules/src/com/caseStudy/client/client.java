package com.caseStudy.client;

import com.caseStudy.Entities.OrderDetails;
import com.caseStudy.Service.OrderService;
import com.caseStudy.Service.OrderServiceImpl;

public class client {
	



	public static void main(String[] args) {
		
		
		
		OrderDetails ord = new OrderDetails();
		
		OrderService Serv = new OrderServiceImpl();
		
		//Add data
		
		ord.setId(4);
		ord.setCustomer_id(45);
		ord.setDateOfPurchase("2022-01-02");
		ord.setPaymentMode("Card");
		ord.setShop_id(33);
		ord.setTotal(10);
	
		Serv.addOrder(ord);
		
		
		
		
		// retrieve
		
		ord=Serv.searchOrder(1);
		System.out.println("ID is "+ord.getId());
		System.out.println("date is "+ord.getDateOfPurchase());
		
		
		
		
		// update
		
		ord=Serv.searchOrder(1);
		ord.setShop_id(21);
		Serv.updateOrder(ord);
		
		
		
		
		// delete
		
		Serv.cancelMall(3);
		
		
		
		
		
	}
	
}
