package Design_patterns.Creational_design_pattern.Factory.Database_v1.Quries;

public class NoSqlQuery implements Queries {
    private String query;
    @Override
    public String getQueries() {
        return query;
    }
}
