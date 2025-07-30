public class PrintingQueue {
    Queue q = new Queue();
    public void newPrintJob(int num){
        q.enqueue(num);
        System.out.println("Added a new Printjob with id:"+num);
    }
    public void processJobs(){
        if(q.isEmpty()){
            System.out.println("No pending Jobs to be done");
        }
        while(q.front!=null){
            int val = q.dequeue();
            System.out.println("processed job id:"+val);
        }
        if(q.front==null) q.rear=null;
    }
    public void viewPending(){
        q.printQueue();
    }
    public static void main(String[] args) {
        PrintingQueue pq = new PrintingQueue();
        pq.newPrintJob(10);
        pq.newPrintJob(20);
        pq.newPrintJob(30);
        pq.viewPending();
        pq.processJobs();
        pq.viewPending();
    }
}
