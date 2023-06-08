package com.designpattern.structural.proxypattern;

public class DatabaseExecutorProxy implements DatabaseExecutor{
    private boolean ifAdmin;
    private DatabaseExecutor dbExecutor;

    public DatabaseExecutorProxy(String name, String password){
        if(name.equalsIgnoreCase("Admin") && password.equals("Admin@123")){
            ifAdmin = true;
        }
        dbExecutor = new DatabaseExecutorImpl();
    }

    @Override
    public void executeDatabase(String query) throws Exception {
        if(ifAdmin){
            dbExecutor.executeDatabase(query);
        }else{
            if(query.equals("DELETE")){
                throw new Exception("DELETE NOT Allowed for NON-Admin user");
            }else{
                dbExecutor.executeDatabase(query);
            }
        }
    }
}
