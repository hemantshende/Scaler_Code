package Design_patterns.Creational_design_pattern.Factory.Database_v4;

import Design_patterns.Creational_design_pattern.Factory.Database_v4.Factories.QueryFactory;
import Design_patterns.Creational_design_pattern.Factory.Database_v4.Quries.Queries;
import Design_patterns.Creational_design_pattern.Factory.Database_v4.Transaction.Transaction;
import Design_patterns.Creational_design_pattern.Factory.Database_v4.Updators.Updators;

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
        DatabaseFactory databaseFactory=database.createDatabaseFactory();

        Queries query=databaseFactory.createQuery();
        Transaction transaction=databaseFactory.createTransaction();
        Updators updators=databaseFactory.createUpdators();

    }

}
