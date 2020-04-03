package nl.han.dea.nielsenmaarten.datasource;
import nl.han.dea.nielsenmaarten.datasource.exeptions.FailedConnectionException;

import javax.inject.Inject;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection implements Serializable {
    private DatabaseProperties databaseProperties;

    public DatabaseConnection(){

    }

    @Inject
    public void setDatabaseProperties(DatabaseProperties databaseProperties){
        this.databaseProperties = databaseProperties;
    }

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(databaseProperties.getConnectionString());
        } catch (SQLException e ) {
            System.out.println(e);
            throw new FailedConnectionException();
        }
    }
}
