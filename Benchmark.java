class Benchmark{
  public static void main(String []args){
  System.out.println("Benchmark:");
  System.out.println("Speed, yo");
  
  long startTime = System.currentTimeMillis();
  long endTime   = System.currentTimeMillis() + 60;
  long number    = 0;
  
  while(true){
    double x = Math.sqrt(number);
    long now = System.currentTimeMillis();
    if (now > endtime){
      break;
      
    }
    number++;
  }
  System.out.print(number + "Calculations");
}
}