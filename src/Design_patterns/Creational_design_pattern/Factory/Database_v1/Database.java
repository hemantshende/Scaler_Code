package Design_patterns.Creational_design_pattern.Factory.Database_v1;

import Design_patterns.Creational_design_pattern.Factory.Database_v1.Quries.Queries;

public interface Database {
    public void getVersion();
    Queries createQuery();
}
