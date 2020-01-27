package oops_concepts;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class singleton_Pattern implements Serializable {

    // this commented code demonstrate the early class loading
   // public static singleton_Pattern singleton_Pattern = new singleton_Pattern();

    public static singleton_Pattern uniInstance = null;
    //static intance variable for maintaining the class instance

    //private constructor so that no object istance is created using 'new' keyword
    private singleton_Pattern(){

        if(uniInstance != null){
            throw new RuntimeException("Cannot Create, please use getInstanceOfsingleton_Pattern method");
        }
        System.out.println("Created Instance");

    }


    // one public single point of entry to get the instance of the class
    // here we do lazy loading of object ie no instance will be created unless its demanded
    public static singleton_Pattern getInstanceOfsingleton_Pattern(){
        if(uniInstance == null ){
            uniInstance = new singleton_Pattern();
            return uniInstance;
        }
        return uniInstance;
    }

    private Object readResolve() throws ObjectStreamException{
        System.out.println(".. read Resolve ..");
        return uniInstance;
    }





    //// Testcases

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException {



        singleton_Pattern s1 = singleton_Pattern.getInstanceOfsingleton_Pattern();
        singleton_Pattern s2 = singleton_Pattern.getInstanceOfsingleton_Pattern();

        System.out.println("s1 :"+s1.hashCode());
        System.out.println("s2 :"+s2.hashCode());



        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(System.getProperty("user.dir")+"/temp.ser"));
        oos.writeObject(s2);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(System.getProperty("user.dir")+"/temp.ser"));
        singleton_Pattern s4 = (singleton_Pattern)ois.readObject();
        System.out.println("s4 :"+s4.hashCode());


        Class clazz = Class.forName("oops_concepts.singleton_Pattern");
        Constructor<singleton_Pattern> ctor = clazz.getDeclaredConstructor();
        singleton_Pattern s3 = ctor.newInstance();


        System.out.println("s3 :"+s3.hashCode());


    }


}
