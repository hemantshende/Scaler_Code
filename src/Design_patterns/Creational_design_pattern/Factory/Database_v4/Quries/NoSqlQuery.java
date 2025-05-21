package Design_patterns.Creational_design_pattern.Factory.Database_v4.Quries;

public class NoSqlQuery implements Queries {
    private String query;
    @Override
    public String getQueries() {
        return query;
    }
}
