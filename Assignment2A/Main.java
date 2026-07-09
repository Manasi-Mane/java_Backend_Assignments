
class NumberPrinter{
    int number=1;
    final int limit=10;

    public synchronized void printOdd(){
        while(limit<=10){
            while(number%2==0){
                try{
                    wait();
                } catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            if(number<=limit){
                System.out.println(Thread.currentThread().getName()+" : "+number);
                number++;
                notify();   
            }
        }
    }

    public synchronized void printEven(){
        while(limit<=10){
            while(number%2!=0){
                try{
                    wait();
                } catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            if(number<=limit){
                System.out.println(Thread.currentThread().getName()+" : "+number);
                number++;
                notify();   
            }
        }
    }
}

class OddThread extends Thread{
    NumberPrinter np;
    OddThread(NumberPrinter np){
        this.np=np;
    }
    public void run(){
        np.printOdd();
    }
}

class EvenThread extends Thread{
    NumberPrinter np;
    EvenThread(NumberPrinter np){
        this.np=np;
    }
    public void run(){
        np.printEven();
    }
}

public class Main{
    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();
        OddThread t1=new OddThread(np);
        EvenThread t2=new EvenThread(np);

        t1.setName("Thread1");
        t2.setName("Thread2");
        t1.start();
        t2.start();
    } 
}