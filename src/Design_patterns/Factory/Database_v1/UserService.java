package Design_patterns.Factory.Database_v1;

import Design_patterns.Factory.Database_v1.Factories.QueryFactory;
import Design_patterns.Factory.Database_v1.Quries.NoSqlQuery;
import Design_patterns.Factory.Database_v1.Quries.Queries;
import Design_patterns.Factory.Database_v1.Quries.SqlQuery;

public class UserService {
    private Database database;

    UserService(Database database){
        this.database=database;
    }

    //note
    //created query factory and getting the query by database..
    public void createUser(){
        Queries query= QueryFactory.getQueryByDatabase(database);
    }

    //getting query by database itself..
    //created method in database class
    public void createQuery1(){
        Queries query= database.createQuery();
    }
}
