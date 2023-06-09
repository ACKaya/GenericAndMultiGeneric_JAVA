public class GenericClass <T>{
    private final T value;
    public GenericClass(T value){
        this.value=value;

    }
    public T getValue(){
        return this.value;
    }
    public boolean isNull(){
        if(this.getValue()==null){
            return true;
        }
        return false;
    }
    public void run(){
        if(isNull()){
            System.out.println("Null bir deger donuyor");
        }
        else{
            System.out.println("Null bir deger donmuyor");
        }
    }
}
