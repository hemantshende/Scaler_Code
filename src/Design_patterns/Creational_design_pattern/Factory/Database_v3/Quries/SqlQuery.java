package Design_patterns.Creational_design_pattern.Factory.Database_v3.Quries;

public class SqlQuery implements Queries {
    private String query;
    @Override
    public String getQueries() {
        return query;
    }
}
