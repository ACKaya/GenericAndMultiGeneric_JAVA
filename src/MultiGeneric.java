public class MultiGeneric <T1,T2,T3>{
    private final T1 obj1;
    private final T2 obj2;
    private final T3 obj3;

    public MultiGeneric(T1 obj1, T2 obj2, T3 obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public T1 getObj1() {
        return obj1;
    }

    public T2 getObj2() {
        return obj2;
    }

    public T3 getObj3() {
        return obj3;
    }
    public void showInfo(){
        System.out.println("T1: "+obj1+" : " +obj1.getClass().getSimpleName());
        System.out.println("T2: "+obj2+" : "+obj2.getClass().getSimpleName());
        System.out.println("T3: "+obj3+" : "+obj3.getClass().getSimpleName());
    }
}
