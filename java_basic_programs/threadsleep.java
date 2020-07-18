class thread1 extends Thread
  {
     public void run()
         { int i;
           for( i=0; i<5; i++)
               {
                try
                   {
                if(i==2) Thread.sleep(1000);
                   }
                catch(Exception e){
                      System.out.println(e);
                    }
                System.out.println("Thread1" +i);
               }
          }

   }
class thread2 extends Thread
  {  
     public void run()
         { int j;
           for( j=0; j<5; j++) 
               { 
                System.out.println("Thread2" +j);
               }
          }

   }
class runnablethread
        {
         public static void main(String[] args)
              {
               thread1 t1 = new thread1();
               thread2 t2 = new thread2();
               
               t1.start();
               t2.start();
             }
        }
