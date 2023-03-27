
package empresa;
import java.sql.*;

public class ConnectionFactory {
    public Connection getConnection(){
        try{
            Connection conexao = DriverManager.getConnection(servidor, login,senba);
            return conexao;
        } catch(SQLException ex){
            System.out.println("Falha no servidor " + ex);
        }
        return null;
    }
    
}
