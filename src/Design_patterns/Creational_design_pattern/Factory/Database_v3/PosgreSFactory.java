package Design_patterns.Creational_design_pattern.Factory.Database_v3;

import Design_patterns.Creational_design_pattern.Factory.Database_v3.Quries.Queries;
import Design_patterns.Creational_design_pattern.Factory.Database_v3.Quries.SqlQuery;
import Design_patterns.Creational_design_pattern.Factory.Database_v3.Transaction.T_A;
import Design_patterns.Creational_design_pattern.Factory.Database_v3.Transaction.Transaction;
import Design_patterns.Creational_design_pattern.Factory.Database_v3.Updators.LazyUpdators;
import Design_patterns.Creational_design_pattern.Factory.Database_v3.Updators.Updators;

public class PosgreSFactory implements DatabaseFactory {
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
