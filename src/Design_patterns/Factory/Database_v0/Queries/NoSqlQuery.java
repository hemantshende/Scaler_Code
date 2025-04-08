package Design_patterns.Factory.Database_v0.Queries;

public class NoSqlQuery implements Queries{
    private String query;
    @Override
    public String getQueries() {
        return query;
    }
}
