package designPattern.factory.version2;

public class MySqlDatabase implements Database {

    @Override
    public Query createQuery() {
        return new MySqlQuery();
    }
}
