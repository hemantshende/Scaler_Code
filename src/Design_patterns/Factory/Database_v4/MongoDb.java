package Design_patterns.Factory.Database_v4;

public class MongoDb implements Database {
    @Override
    public void getVersion() {

    }

    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new MongoDbFactory();
    }
}
