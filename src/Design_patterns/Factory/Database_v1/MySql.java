package Design_patterns.Factory.Database_v1;

import Design_patterns.Factory.Database_v1.Quries.Queries;
import Design_patterns.Factory.Database_v1.Quries.SqlQuery;

public class MySql implements Database {
    @Override
    public void getVersion() {

    }

    @Override
    public Queries createQuery() {
        return new SqlQuery();
    }
}
