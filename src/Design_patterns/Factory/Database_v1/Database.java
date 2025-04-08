package Design_patterns.Factory.Database_v1;

import Design_patterns.Factory.Database_v1.Quries.Queries;

public interface Database {
    public void getVersion();
    Queries createQuery();
}
