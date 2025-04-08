package Design_patterns.Factory.Database_v3;

import Design_patterns.Factory.Database_v3.Quries.Queries;
import Design_patterns.Factory.Database_v3.Transaction.Transaction;
import Design_patterns.Factory.Database_v3.Updators.Updators;

public interface DatabaseFactory {
    Queries createQuery();
    Transaction createTransaction();
    Updators createUpdators();
}
