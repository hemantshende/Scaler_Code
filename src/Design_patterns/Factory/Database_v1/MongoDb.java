package Design_patterns.Factory.Database_v1;

import Design_patterns.Factory.Database_v1.Quries.NoSqlQuery;
import Design_patterns.Factory.Database_v1.Quries.Queries;

public class MongoDb implements Database {
    @Override
    public void getVersion() {

    }

    @Override
    public Queries createQuery() {
        return new NoSqlQuery();
    }
}
