package Design_patterns.Creational_design_pattern.Factory.Database_v1;

import Design_patterns.Creational_design_pattern.Factory.Database_v1.Quries.Queries;
import Design_patterns.Creational_design_pattern.Factory.Database_v1.Quries.SqlQuery;

public class PosgreS implements Database {
    @Override
    public void getVersion() {

    }

    @Override
    public Queries createQuery() {
        return new SqlQuery();
    }
}
