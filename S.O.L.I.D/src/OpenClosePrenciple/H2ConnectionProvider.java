package OpenClosePrenciple;


import java.sql.Connection;

public class H2ConnectionProvider implements IConnectionProvider {


    @Override
    public Connection establishConnection() {
        System.out.println("connected to H2");
        return null;
    }
}
