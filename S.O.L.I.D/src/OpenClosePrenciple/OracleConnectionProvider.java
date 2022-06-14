package OpenClosePrenciple;

import java.sql.Connection;

public class OracleConnectionProvider implements IConnectionProvider{

    @Override
    public Connection establishConnection() {
        System.out.println("connected to Oracle !");
        return null;
    }
}
