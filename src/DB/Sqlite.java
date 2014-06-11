package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.sqlite.SQLiteConfig;

/**
 *
 * @author carlos
 */
public class Sqlite {

    private static Sqlite instance = new Sqlite();
    private Connection con;
    private final String db = "db\\gestor.sqlite";

    //Metodo que devuelve la Instancia
    public static Sqlite getInstance() {
        return instance;
    }
    
    //Constructor
    private Sqlite() {
        try {
            Class.forName("org.sqlite.JDBC");
            SQLiteConfig config = new SQLiteConfig();
            config.enforceForeignKeys(true);
            con = DriverManager.getConnection("jdbc:sqlite:" + this.db, config.toProperties());
        } catch (ClassNotFoundException | SQLException e) {
        }
    }

    //Metodo que devuelve un resultado de una consulta pasando esta como parametro
    public ResultSet consulta(String consulta) {

        ResultSet resultado = null;
        try {
            PreparedStatement ps = con.prepareStatement(consulta);
            resultado = ps.executeQuery();
        } catch (SQLException e) {
        }
        return resultado;
    }

    public void update(String update) throws SQLException {
        con.createStatement().executeUpdate(update);
    }

    /*
     * Devuelve la conexion con la base de datos (necesaria para generar informes)
     */
    public Connection getConnection() {
        return con;
    }

}