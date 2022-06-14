package DependencyInversionPrenciple;

import java.sql.Connection;

public interface DataSource {
    void createConnection(DatabaseConfig config);
    Connection getConnection();

}
