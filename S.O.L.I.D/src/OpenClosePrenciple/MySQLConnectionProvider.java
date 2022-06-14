package OpenClosePrenciple;

import java.sql.Connection;

public class MySQLConnectionProvider implements IConnectionProvider{

    @Override
    public Connection establishConnection() {
        System.out.println("connected to MySQL !");
        return null;
    }
}
