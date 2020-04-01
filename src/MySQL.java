
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;


public class MySQL {
    private Connection servidor;
    private Statement consulta;
    
    public MySQL() {
        try {
            servidor = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/aulajava", "root", "");
            consulta = (Statement)servidor.createStatement();
        } catch(Exception erro) {
            System.out.println("Erro!" + erro.getMessage());
        }
    }
    
    public Connection getServidor() {
        return servidor;
    }

    public Statement getConsulta() {
        return consulta;
    }

    public void setServidor(Connection servidor) {
        this.servidor = servidor;
    }

    public void setConsulta(Statement consulta) {
        this.consulta = consulta;
    }
    
}
