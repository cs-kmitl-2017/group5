package th.ac.kmitl.science.comsci.example.dal.connection.jdbc;

import th.ac.kmitl.science.comsci.example.dal.connection.jdbc.attributes.JdbcDriver;

import java.sql.SQLException;

@JdbcDriver("com.mysql.jdbc.Driver")
public class MySqlConnection extends DatabaseConnection {

    public MySqlConnection(String databaseUri, String username, String password) throws SQLException {
        super(databaseUri, username, password);
    }
}
