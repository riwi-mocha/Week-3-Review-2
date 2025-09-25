public abstract class Process {
   final public void execute(){
    prepare();
    process();
   }
   public abstract void prepare();
   
   public abstract void process();
   
   public void finish(){
    System.out.println("OK");
   }
}
