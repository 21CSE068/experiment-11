import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
package database;
/**
 *
 * @author 21cse068
 */
public class Database {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Connection s=DriverManager.getConnection("jdbc:derby://localhost:1527/ebookshop");
        Statement st=s.createStatement();
        ResultSet rs=st.executeQuery("Select * from books");
        while(rs.next())
        {
            System.out.print(r.getInt(1)+"\t");
            System.out.print(r.getString(2)+"\t");
            System.out.print(r.getString(3)+"\t");
            System.out.print(r.getFloat(4)+"\t");
            System.out.print(r.getFloat(5));
            System.out.println();
        }
System.out.println("------------------------------");
      ResultSet r= st.executeQuery("select title,author,price,quantity from books where author='Tan Ah Teck'");
      while(r.next())
      {
           System.out.print(rs.getString(1)+"\t");
            System.out.print(rs.getString(2)+"\t");
            System.out.print(rs.getFloat(3)+"\t");
            System.out.print(rs.getFloat(4));
            System.out.println();
      }
        st.executeUpdate("update books set quantity=0 where title='A Teaspoon of Java'");
        st.executeUpdate("delete from books where id=8001");
        st.executeUpdate("insert into books values(8001,'java ABC','kevin jones',5.55,55)");
        s.close();
    }
}
