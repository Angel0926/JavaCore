package ClassWork.allLessons.lesson15.callBack;

  class Client implements  CallBack {
   public void callBack(int p){
        System.out.println("metod callback(), "+ "vizivaemiy so znacheniem" + p);
    }


    void nonIfaceMeth(){
        System.out.println("v klassax realiz interface, mogut bit i drugie chleni");
    }
}
