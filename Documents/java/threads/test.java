class TaskX extends Thread {

    public void run(){
        Thread currentThread = Thread.currentThread();
        
        for(int i=0; i<10; i++){
            if(currentThread.getName().equals("Bad")){
            try{
                Thread.sleep(3000);
            }catch(Exception ex){
            
            }
        }
            System.out.println("i value is " + i + " in Thread " 
            + currentThread.getName());
        }
    }
    
    public void doSomething(){
        System.out.println("I am Incredible");
    }
}



class TaskY implements Runnable {

    public void run(){
        Thread currentThread = Thread.currentThread();
        for(int i=0; i<10; i++){
            System.out.println("i value is " + i + " in Thread " 
            + currentThread.getName());
        }
    }
}




class Test {

    static public  void main(String[] felight){
    
        Thread currentThread = Thread.currentThread();
        System.out.println("Name " + currentThread.getName() 
        + " Id : " + currentThread.getId() + " Priority : " + currentThread.getPriority() );
        
        System.out.println("Task 1");
        System.out.println("Task 2");
        System.out.println("Task 3");
        
        //Using Runnable
        TaskY obj = new TaskY(); // Here we have object of Runnable
        Thread t2 = new Thread(obj); // Here we have object of Thread
        t2.setName("Good");
        //where obj of runnable is sent as input 
        t2.start();
        
        //Extending thread 
        TaskX t1 = new TaskX();
        t1.setName("Bad");
        t1.setPriority(7);
        t1.start();
        
        
        TaskX t3 = new TaskX();
        t3.setName("Ugly");
        t3.setPriority(10);
        t3.start();
        
                
        System.out.println("Task 4");
        System.out.println("Task 5");
        
        
    }

}


