package Design_patterns.Creational_design_pattern.Factory.Database_v2;

import Design_patterns.Creational_design_pattern.Factory.Database_v2.Quries.NoSqlQuery;
import Design_patterns.Creational_design_pattern.Factory.Database_v2.Quries.Queries;
import Design_patterns.Creational_design_pattern.Factory.Database_v2.Transaction.T_B;
import Design_patterns.Creational_design_pattern.Factory.Database_v2.Transaction.Transaction;
import Design_patterns.Creational_design_pattern.Factory.Database_v2.Updators.Eager_Updators;
import Design_patterns.Creational_design_pattern.Factory.Database_v2.Updators.Updators;

public class MongoDb implements Database {
    @Override
    public void getVersion() {

    }

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
