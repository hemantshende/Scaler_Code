package Design_patterns.Creational_design_pattern.Factory.Database_v3.Factories;

import Design_patterns.Creational_design_pattern.Factory.Database_v3.Database;
import Design_patterns.Creational_design_pattern.Factory.Database_v3.MongoDb;
import Design_patterns.Creational_design_pattern.Factory.Database_v3.MySql;
import Design_patterns.Creational_design_pattern.Factory.Database_v3.PosgreS;
import Design_patterns.Creational_design_pattern.Factory.Database_v3.Quries.NoSqlQuery;
import Design_patterns.Creational_design_pattern.Factory.Database_v3.Quries.Queries;
import Design_patterns.Creational_design_pattern.Factory.Database_v3.Quries.SqlQuery;

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
