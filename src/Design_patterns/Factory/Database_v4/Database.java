package Design_patterns.Factory.Database_v4;

public interface Database {
    public void getVersion();

    //factory methods removed to database factory
    DatabaseFactory createDatabaseFactory();
}
