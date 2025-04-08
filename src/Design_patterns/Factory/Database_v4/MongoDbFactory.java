package Design_patterns.Factory.Database_v4;

import Design_patterns.Factory.Database_v4.Quries.NoSqlQuery;
import Design_patterns.Factory.Database_v4.Quries.Queries;
import Design_patterns.Factory.Database_v4.Transaction.T_B;
import Design_patterns.Factory.Database_v4.Transaction.Transaction;
import Design_patterns.Factory.Database_v4.Updators.Eager_Updators;
import Design_patterns.Factory.Database_v4.Updators.Updators;

public class MongoDbFactory implements DatabaseFactory {

    @Override
    public Queries createQuery() {
        return new NoSqlQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new T_B();
    }

    @Override
    public Updators createUpdators() {
        return new Eager_Updators();
    }
}
