package com.shop.db;
public class SQL {
	//Customer
	public final static  String INSERT_CUSTOMER = "INSERT INTO `Customer` VALUES(?, ?, ?, ?, NOW())";
	public final static  String SELECT_CUSTOMERS = "SELECT * FROM `Customer`";
	public final static  String SELECT_CUSTOMER = "SELECT * FROM `Customer` WHERE `custId`=?";
	public final static  String UPDATE_CUSTOMER = "UPDATE `Customer` SET "
											+ "`name`=?,"
											+ "`hp`=?,"
											+ "`age`=? "
											+ "WHERE `custId`=?";
	public final static  String DELETE_CUSTOMER = "DELETE FROM `Customer` WHERE `custId`=?";
	//product
	public final static String SELECT_PRODUCTS = "SELECT * FROM `Product`";
	//order
	public final static String INSERT_ORDER = "INSERT INTO `Order` SET "
			+ "`orderNo`=?,"
			+ "`orderId`=?, "
			+ "`orderProduct`=?, "
			+ "`orderCount`=?, "
			+ "`orderDate` = NOW()";
	public final static String ORDER_OWNER =  "SELECT `name` FROM `Customer` WHERE `custId`=?";
}
