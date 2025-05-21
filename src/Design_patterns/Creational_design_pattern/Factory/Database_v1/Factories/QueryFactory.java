package Design_patterns.Creational_design_pattern.Factory.Database_v1.Factories;

import Design_patterns.Creational_design_pattern.Factory.Database_v1.Database;
import Design_patterns.Creational_design_pattern.Factory.Database_v1.MongoDb;
import Design_patterns.Creational_design_pattern.Factory.Database_v1.MySql;
import Design_patterns.Creational_design_pattern.Factory.Database_v1.PosgreS;
import Design_patterns.Creational_design_pattern.Factory.Database_v1.Quries.NoSqlQuery;
import Design_patterns.Creational_design_pattern.Factory.Database_v1.Quries.Queries;
import Design_patterns.Creational_design_pattern.Factory.Database_v1.Quries.SqlQuery;

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
