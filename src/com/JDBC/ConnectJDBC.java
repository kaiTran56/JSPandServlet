package com.JDBC;

public class ConnectJDBC {
	private String user;
	private String passWord;

	/*
	 * public void accessJDBC() { try { Class.forName("com.mysql.cj.jdbc.Driver");
	 * java.sql.Connection connect = DriverManager
	 * .getConnection("jdbc:mysql://localhost:3306/password_website", "root",
	 * "54935620tQ."); connect.setAutoCommit(false); String sql =
	 * "select*from admin"; Statement statement = connect.createStatement();
	 * ResultSet result = statement.executeQuery(sql);
	 * 
	 * while (result.next()) { this.user = result.getString("uesr"); this.passWord =
	 * result.getString("password"); } connect.commit(); } catch
	 * (ClassNotFoundException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } catch (SQLException e) { // TODO Auto-generated catch
	 * block e.printStackTrace(); } }
	 */

	public boolean Authentication(String user, String passWord) {
		
		return user.equals("quyet") && passWord.equals("12345") ? true : false;
	}
}
