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
	public final static String SELECT_PRODUCTS = "SELECT * FROM `Product` WHERE `stock` > 0";
	public final static String SELECT_PRODUCT = "SELECT * FROM `Product` WHERE `prodNo`=? AND `stock` > 0";
	//order
	public final static String SELECT_ORDERS0 ="SELECT `orderNo`, `name`, `prodName`, `orderCount`, DATE_FORMAT(`orderDate`, '%Y-%m-%d') AS `orderDate2`\n"
			+ "FROM `Order` AS a \n"
			+ "JOIN `Customer` AS b ON a.orderID = b.custId \n"
			+ "JOIN `Product` AS c ON a.orderProduct = c.prodNo \n"
			+ "WHERE `orderID` = 'c999';";
	public final static String SELECT_ORDERS2 = "SELECT *  FROM `Order` WHERE `orderId` = ?";
	
	public final static String SELECT_ORDERS = "SELECT a.*, b.`name`, c.`prodName` "
			+ "FROM `Order` AS a "
			+ "JOIN `Customer` AS b ON a.orderId = b.custId "
			+ "JOIN `Product` AS c ON a.orderProduct = c.prodNo "
			+ "WHERE `orderId` = ?";
	public final static String INSERT_ORDER = "INSERT INTO `Order` SET "
			+ "`orderNo`=?,"
			+ "`orderId`=?, "
			+ "`orderProduct`=?, "
			+ "`orderCount`=?, "
			+ "`orderDate` = NOW()";
	public final static String UPDATE_PRODUCT_STOCK = "UPDATE `Product` SET `stock`=`stock`- ? WHERE `prodNo` = ? "; 
}
