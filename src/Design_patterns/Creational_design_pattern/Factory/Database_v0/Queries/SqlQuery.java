package Design_patterns.Creational_design_pattern.Factory.Database_v0.Queries;

public class SqlQuery implements Queries{
    private String query;
    @Override
    public String getQueries() {
        return query;
    }
}
