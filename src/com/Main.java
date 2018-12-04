package com;

public class Main {
    public static void main(String[] args) {

    }
}
interface DAO{
    void execute();
}

class DataAccess implements DAO{
    public void execute(){
        System.out.println("Execute");
    }
}



class Client{
    DAO dataAccess=new DataAccess();
    void doJob(){}
}



















