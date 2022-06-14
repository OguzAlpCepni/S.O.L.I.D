package OpenClosePrenciple;

import java.sql.Connection;

public interface IConnectionProvider {
    public Connection establishConnection();
}
