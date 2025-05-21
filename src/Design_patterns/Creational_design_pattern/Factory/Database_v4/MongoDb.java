package Design_patterns.Creational_design_pattern.Factory.Database_v4;

public class MongoDb implements Database {
    @Override
    public void getVersion() {

    }

    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new MongoDbFactory();
    }
}
