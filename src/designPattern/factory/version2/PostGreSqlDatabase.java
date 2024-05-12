package designPattern.factory.version2;

public class PostGreSqlDatabase implements Database {

    @Override
    public Query createQuery() {
        return new PostGreSqlQuery();
    }
}
