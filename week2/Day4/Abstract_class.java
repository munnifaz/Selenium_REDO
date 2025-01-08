package week2.Day4;

public class Abstract_class implements DatabaseConnection{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void connect() {
		System.out.println("Database connected");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Databse Disconnected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("The database verison is being updated");
		
	}
	
	public String executeQuery(String Username, String password, String Dbconnection) {
		
		String DBconnect=Username+""+password+""+Dbconnection;
		
		System.out.println(DBconnect);
		return DBconnect;
		
	}

}
