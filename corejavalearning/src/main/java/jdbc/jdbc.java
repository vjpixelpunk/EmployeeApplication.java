package jdbc;

import java.sql.*;

public class jdbc {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try{
            con = ConnectUtil.getconnection();
            st = con.createStatement();
            //rs = st.executeQuery("select id, first_name, last_name, email, gender, salary from emp_data limit 100");
            rs = st.executeQuery("select * from emp_data limit 200");
            while(rs.next()){
                Integer id = rs.getInt("id");
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");
                String email = rs.getString("email");
                String gender = rs.getString("gender");
                Double salary = rs.getDouble("salary");

                System.out.println(String.format("%s - %s - %s - %s - %s", id,first_name,last_name,email,gender,salary));
            }
        }catch(SQLException e){
            System.out.println(e);
        }finally{
            ConnectUtil.close(rs,st,con);
        }

    }
}
