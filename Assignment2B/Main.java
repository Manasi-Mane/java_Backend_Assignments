

class Sender{
    public synchronized void send(String msg){
        System.out.println(msg);
    }
}

class ThreadedSend extends Thread{
    Sender s;
    String msg;

    public ThreadedSend(Sender s, String msg) {
        this.s=s;
        this.msg=msg;
    }

    public void run(){
        s.send(msg);
    }
    
}

class Demo{
    public static void main(String[] args){
        Sender s= new Sender();
        ThreadedSend t1=new ThreadedSend(s,"Hi");
        ThreadedSend t2=new ThreadedSend(s,"Bye");
        t1.start();
        t2.start();
    }
}