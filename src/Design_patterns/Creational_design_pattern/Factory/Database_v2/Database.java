package Design_patterns.Creational_design_pattern.Factory.Database_v2;

import Design_patterns.Creational_design_pattern.Factory.Database_v2.Quries.Queries;
import Design_patterns.Creational_design_pattern.Factory.Database_v2.Transaction.Transaction;
import Design_patterns.Creational_design_pattern.Factory.Database_v2.Updators.Updators;

public interface Database {
    public void getVersion();

    //factory methods
    Queries createQuery();
    Transaction createTransaction();
    Updators createUpdators();
}
