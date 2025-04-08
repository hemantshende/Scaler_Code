package Design_patterns.Factory.Database_v4.Factories;

import Design_patterns.Factory.Database_v4.Database;
import Design_patterns.Factory.Database_v4.MongoDb;
import Design_patterns.Factory.Database_v4.MySql;
import Design_patterns.Factory.Database_v4.PosgreS;
import Design_patterns.Factory.Database_v4.Quries.NoSqlQuery;
import Design_patterns.Factory.Database_v4.Quries.Queries;
import Design_patterns.Factory.Database_v4.Quries.SqlQuery;

public class QueryFactory {
    public static Queries getQueryByDatabase(Database database){
        Queries query=null;
        if(database instanceof MySql){
            query=new SqlQuery();
        }else if(database instanceof PosgreS){
            query=new SqlQuery();
        }else if(database instanceof MongoDb){
            query=new NoSqlQuery();
        }
        return query;
    }
}
