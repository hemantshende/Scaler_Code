package Design_patterns.Creational_design_pattern.Factory.Database_v2.Factories;

import Design_patterns.Creational_design_pattern.Factory.Database_v2.Database;
import Design_patterns.Creational_design_pattern.Factory.Database_v2.MongoDb;
import Design_patterns.Creational_design_pattern.Factory.Database_v2.MySql;
import Design_patterns.Creational_design_pattern.Factory.Database_v2.PosgreS;
import Design_patterns.Creational_design_pattern.Factory.Database_v2.Quries.NoSqlQuery;
import Design_patterns.Creational_design_pattern.Factory.Database_v2.Quries.Queries;
import Design_patterns.Creational_design_pattern.Factory.Database_v2.Quries.SqlQuery;

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
