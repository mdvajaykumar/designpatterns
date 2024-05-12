package designPattern.factory.version1;

public class client {
    public static void main(String[] args) {
        Database db;


        //here violates SRP PRINCIPLE

//        if(db is isntance of MySql){
//            return new MySqlDatabase();
//        } else if(db instance of PostGreSqlDatabase){
//            new PostGreSqlDatabase();
//        }

    }
}
