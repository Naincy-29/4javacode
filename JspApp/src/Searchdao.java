import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Searchdao {
	public Connection getConnection() throws ClassNotFoundException, SQLException{
		ResourceBundle rb=ResourceBundle.getBundle("person");
		Class.forName(rb.getString("Driver"));
		Connection con=DriverManager.getConnection(rb.getString("url"),rb.getString("userid"),rb.getString("password"));
		
		return con;
		
	}
	public ArrayList getproducts( String name) throws SQLException, ClassNotFoundException{
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs =null;
		String query="select id,name,salary from person where name=?";
		ArrayList<Persondto> list=new ArrayList<>();
		try{
		con=getConnection();
		pstmt=con.prepareStatement(query);
		pstmt.setString(1, name);
		rs=pstmt.executeQuery();
		while(rs.next()){
			Persondto dto=new Persondto();
			dto.setId(rs.getInt("id"));
			dto.setName(rs.getString("name"));
			dto.setSalary(rs.getString("salary"));
			list.add(dto);
			
		}
		}
		finally{
			if(rs!=null)
				rs.close();
			if (pstmt!=null)
				pstmt.close();
			if (con!=null)
				con.close();
		}
		return list;
		
	}

}
