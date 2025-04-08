package Design_patterns.Factory.Database_v2.Quries;

public class NoSqlQuery implements Queries {
    private String query;
    @Override
    public String getQueries() {
        return query;
    }
}
