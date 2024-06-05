package com.synechron;

class Singlaton{

    private static volatile Singlaton singlaton = null;


    private  Singlaton(){

    }


    public static Singlaton getInstance(){
        if(singlaton == null){
            synchronized (Singlaton.class){
                if(singlaton == null)
                singlaton = new Singlaton();
            }
        }
        return singlaton;
    }


    public void showOutput(){
        synchronized (this){
            System.out.println("Hello");
        }


    }

}



public class Test82 {
    public static void main(String[] args) {
        System.out.println("Hello");

       Runnable s = () -> {
           Singlaton singlaton = Singlaton.getInstance();
           singlaton.showOutput();
       } ;

       Thread t1 = new Thread(s);
       Thread t2 = new Thread(s);

       t1.start();
       t2.start();


    }
}


// @RequestMapping("/products")


//@GetMapping("/{productId}")



