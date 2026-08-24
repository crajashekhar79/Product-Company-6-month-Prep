
class Mobile{
   private String brand ;
   private  int price ;
   private  String name ;

   public Mobile( String b, int p, String n ){
       this.price = p;
       this.name = n ;
       this.brand = b ;
       System.out.println("this is from constructor");
       System.out.println(brand+":"+price+":"+name);
   }


}
public class Consturctors {
    public static void main(String[] args) {
        Mobile mb = new Mobile("Samsung",1500,"SmartPhone");

        //System.out.println();

        //System.out.println();

    }

}
