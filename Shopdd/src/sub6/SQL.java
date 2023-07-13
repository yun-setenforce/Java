package sub6;
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
}
