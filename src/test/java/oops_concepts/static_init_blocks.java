package oops_concepts;

public class static_init_blocks {

    //STATIC BLOCK WITH STATIC KEYWORD WILL BE CALLED WITHOUT EVEN CREATING INSTANCE
    // normal static block and constructor will only be called after creting instance

    {
        System.out.println("this is normal init block, without static keyword");
    }

    static{
        System.out.println("this is init block, with static keyword");
    }


    public static_init_blocks(){
        System.out.println("this is constructor");
    }

    public static void main(String[] args){
        static_init_blocks sb = new static_init_blocks();
        //System.out.println("this is main");
    }

}
