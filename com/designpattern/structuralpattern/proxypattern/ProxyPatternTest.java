package com.designpattern.structuralpattern.proxypattern;

public class ProxyPatternTest {
    public static void main(String[] args){
        
        System.out.println("Admin Executor");
        DatabaseExecutor adminExecutor = new DatabaseExecutorProxy("Admin","Admin@123");
        try{
            adminExecutor.executeDatabase("ADD");
            adminExecutor.executeDatabase("EDIT");
            adminExecutor.executeDatabase("FETCH");
            adminExecutor.executeDatabase("DELETE");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println("Non-Admin Executor");

        DatabaseExecutor nonAdminExecutor = new DatabaseExecutorProxy("NonAdmin", "Admin@123");
        try{
            nonAdminExecutor.executeDatabase("ADD");
            nonAdminExecutor.executeDatabase("EDIT");
            nonAdminExecutor.executeDatabase("FETCH");
            nonAdminExecutor.executeDatabase("DELETE");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
