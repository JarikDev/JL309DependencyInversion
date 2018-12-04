package com;

public class Main2 {
    public static void main(String[] args) {

    }
}
interface IntWorker{
    void work();
}
class Worker implements IntWorker{
    @Override
    public void work() {
        System.out.println("just work");
    }
}

class SuperWorker implements IntWorker{
    @Override
    public void work() {
        System.out.println("Do super work");
    }
}
class Manager {
    IntWorker worker;
    public void setWorker(IntWorker w){
        worker=w;
    }
    public void mange(){
        worker.work();
    }
}