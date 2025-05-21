package Design_patterns.Creational_design_pattern.Factory.Database_v2;

import Design_patterns.Creational_design_pattern.Factory.Database_v2.Quries.Queries;
import Design_patterns.Creational_design_pattern.Factory.Database_v2.Quries.SqlQuery;
import Design_patterns.Creational_design_pattern.Factory.Database_v2.Transaction.T_A;
import Design_patterns.Creational_design_pattern.Factory.Database_v2.Transaction.Transaction;
import Design_patterns.Creational_design_pattern.Factory.Database_v2.Updators.LazyUpdators;
import Design_patterns.Creational_design_pattern.Factory.Database_v2.Updators.Updators;

public class PosgreS implements Database {
    @Override
    public void getVersion() {

    }

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
