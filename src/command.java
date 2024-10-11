docker exec -it mysqlj mysql -u root -p
password

docker start mysqlj

Class.forName("com.mysql.cj.jdbc.Driver");

jdbc:mysql://localhost:3306/database01?user=user01&password=password01&useSSL=false&allowPublicKeyRetrieval=true

	String url = "jdbc:mysql://localhost:3306/database01?user=user01&"
	
+ "password=password01&useSSL=false&allowPublicKeyRetrieval=true"; //長いので改行

Connection connection = DriverManager.getConnection(url);

PreparedStatement statement = connection.prepareStatement("select * from user");

ResultSet resultSet = statement.executeQuery();

resultSet.getString("name"));

resultSet.getLong("id"));

while (resultSet.next()) {
    System.out.println("----------------------");
    System.out.println(resultSet.getLong("id"));
    System.out.println(resultSet.getString("email"));
    System.out.println(resultSet.getString("name"));
    System.out.println(resultSet.getDate("created_at"));
    System.out.println(resultSet.getDate("updated_at"));
}