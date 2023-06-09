public class Main {
    public static void main(String[] args) {
    /*isEmpty is=new isEmpty("");
    is.print();
    is.printEmpty();
    GenericClass <Integer> g=new GenericClass<>(10);
    g.run();*/
      int a=10;
      String b="keles";
      Float c=5.4f;
        MultiGeneric <Integer,String,Float> m=new MultiGeneric<>(a,b,c);
        m.showInfo();
    }
}
