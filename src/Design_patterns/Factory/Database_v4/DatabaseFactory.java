package Design_patterns.Factory.Database_v4;

import Design_patterns.Factory.Database_v4.Quries.Queries;
import Design_patterns.Factory.Database_v4.Transaction.Transaction;
import Design_patterns.Factory.Database_v4.Updators.Updators;

public interface DatabaseFactory {
    Queries createQuery();
    Transaction createTransaction();
    Updators createUpdators();
}
