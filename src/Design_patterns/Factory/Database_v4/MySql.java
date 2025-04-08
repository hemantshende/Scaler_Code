package Design_patterns.Factory.Database_v4;

public class MySql implements Database {
    @Override
    public void getVersion() {

    }

    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new MySqlFactory();
    }

}
