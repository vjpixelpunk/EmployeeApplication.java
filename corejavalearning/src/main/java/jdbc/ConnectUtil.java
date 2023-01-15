package jdbc;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class ConnectUtil {

    private static Properties properties;
    static{
        properties = new Properties();
        try {
            properties.load(ConnectUtil.class.getResourceAsStream("/db.properties"));
        } catch (IOException e) {
            System.out.println("while loading properties : " + e);
        }

    }

    public static Connection getconnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(

                    properties.getProperty("db.url"),
                    properties.getProperty("db.username"),
                    properties.getProperty("db.password")
            );

        } catch (SQLException e) {
            System.out.println("While Connecting eith DB : " + e);
        }
        return con;
    }

    public static void close(ResultSet rs, Statement st, Connection con){
        try{
            if (rs!= null){
                rs.close();
            }
            if (st != null){
                st.close();
            }
            if (con!= null){
                con.close();
            }
        }catch(SQLException e){
            System.out.println("while closing resources : "+ e);
        }


    }

    public static void close( Statement st, Connection con){
        try{
            if (st != null){
                st.close();
            }
            if (con!= null){
                con.close();
            }
        }catch(SQLException e){
            System.out.println("while closing resources : "+ e);
        }

    }

}
