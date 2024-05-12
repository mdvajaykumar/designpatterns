public class SingletonClass {

    public  static SingletonClass instance;

    private SingletonClass(){
         System.out.println("singleInstance");
    }


    public static SingletonClass getInstance(){

        if(instance !=null){
           instance = new SingletonClass();
        }
        return instance;

    }


}
