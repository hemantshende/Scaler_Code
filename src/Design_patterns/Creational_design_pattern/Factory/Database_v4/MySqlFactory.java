package Design_patterns.Creational_design_pattern.Factory.Database_v4;

import Design_patterns.Creational_design_pattern.Factory.Database_v4.Quries.Queries;
import Design_patterns.Creational_design_pattern.Factory.Database_v4.Quries.SqlQuery;
import Design_patterns.Creational_design_pattern.Factory.Database_v4.Transaction.T_A;
import Design_patterns.Creational_design_pattern.Factory.Database_v4.Transaction.Transaction;
import Design_patterns.Creational_design_pattern.Factory.Database_v4.Updators.LazyUpdators;
import Design_patterns.Creational_design_pattern.Factory.Database_v4.Updators.Updators;

public class MySqlFactory implements DatabaseFactory {
    @Override
    public Queries createQuery() {
        return new SqlQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new T_A();
    }

    @Override
    public Updators createUpdators() {
        return new LazyUpdators();
    }
}
