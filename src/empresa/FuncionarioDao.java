
package empresa;
import java.sql.*;
import java.util.ArrayList;


public class FuncionarioDao {
    private Connection connection;
    public FuncionarioDao(){
        this.connection = new ConnectionFactory().getConnection();
    }
    public void adiciona(Funcionario func){
        String sql = "INSERT INTO funcionarios VALUES (?,?,?,?,?,?)";
        try{
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            stmt.setLong(1,func.getNumat());
            stmt.setString(2,func.getNome());
            stmt.setDouble(3,func.getSalario());
            stmt.setString(4,func.getSexo());
            stmt.setInt(5, func.getNdepto());
            stmt.setInt(6,func.getNsuper());
            stmt.executeUpdate();
            stmt.close();
     
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public ArrayList <Funcionario> getLista(){
        String sql = "SELECT * from funcionarios";
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        try{
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Funcionario func = new Funcionario();
                func.setNumat(rs.getInt("Numat"));
                func.setNome(rs.getString("nome"));
                func.setSalario(rs.getDouble("Salario"));
                func.setSexo(rs.getString("sexo"));
                func.setNdepto(rs.getInt("ndepto"));
                func.setNsuper(rs.getInt("nsuper"));
                funcionarios.add(func);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        return funcionarios;
    }
}
