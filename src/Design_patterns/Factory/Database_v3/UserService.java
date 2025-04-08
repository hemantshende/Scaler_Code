package Design_patterns.Factory.Database_v3;

import Design_patterns.Factory.Database_v3.Transaction.Transaction;
import Design_patterns.Factory.Database_v3.Updators.Updators;
import Design_patterns.Factory.Database_v3.Factories.QueryFactory;
import Design_patterns.Factory.Database_v3.Quries.Queries;

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
    public void create(){
        DatabaseFactory databaseFactory=null;
        if(database instanceof MySql){
            databaseFactory=new MySqlFactory();
        }else if(database instanceof MongoDb){
            databaseFactory=new MongoDbFactory();
        } else if (database instanceof PosgreS){
            databaseFactory=new PosgreSFactory();
        }

        Queries query=databaseFactory.createQuery();
        Transaction transaction=databaseFactory.createTransaction();
        Updators updators=databaseFactory.createUpdators();

    }

}
