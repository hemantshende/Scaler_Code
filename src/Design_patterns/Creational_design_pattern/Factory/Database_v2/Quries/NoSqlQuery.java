package Design_patterns.Creational_design_pattern.Factory.Database_v2.Quries;

public class NoSqlQuery implements Queries {
    private String query;
    @Override
    public String getQueries() {
        return query;
    }
}
