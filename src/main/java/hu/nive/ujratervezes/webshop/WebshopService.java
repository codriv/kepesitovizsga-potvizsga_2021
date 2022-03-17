package hu.nive.ujratervezes.webshop;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class WebshopService {

    private MariaDbDataSource dataSource;

    public WebshopService(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> getValuableCustomers() {
        try(Connection con = dataSource.getConnection();
            Statement stmt = con.createStatement()) {
            return getResult(stmt);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach database!");
        }
    }

    private List<String> getResult(Statement stmt) throws SQLException {
        try(ResultSet rs = stmt.executeQuery("select customer_name from orders where total > 1000 order by customer_name")) {
            List<String> customers = new ArrayList<>();
            while (rs.next()) {
                String customer = rs.getString("customer_name");
                customers.add(customer);
            }
            return customers;
        }
    }
}
