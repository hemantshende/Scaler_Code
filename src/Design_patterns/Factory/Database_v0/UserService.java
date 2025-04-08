package Design_patterns.Factory.Database_v0;

import Design_patterns.Factory.Database_v0.Queries.NoSqlQuery;
import Design_patterns.Factory.Database_v0.Queries.Queries;
import Design_patterns.Factory.Database_v0.Queries.SqlQuery;

public class UserService {
    private Database database;

    UserService(Database database){
        this.database=database;
    }

    public void createUser(){
        Queries q=null;
        if(database instanceof MySql){
            q=new SqlQuery();
        }else if(database instanceof PosgreS){
            q=new SqlQuery();
        }else if(database instanceof MongoDb){
            q=new NoSqlQuery();
        }
    }
}
