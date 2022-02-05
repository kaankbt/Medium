package dependencyInversion.example2;

public class ExceptionReporter {
    private final IDatabase database;

    public ExceptionReporter(IDatabase database) {
        this.database = database;
    }

    public void reportException(Exception exception) {
        database.add(exception);
    }
}

class MySQLDatabase implements IDatabase {
    @Override
    public void add(Object object) {
        //..
    }
}

class OracleDatabase implements IDatabase {
    @Override
    public void add(Object object) {
        //..
    }
}

interface IDatabase {
    void add(Object object);
}
