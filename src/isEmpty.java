public class isEmpty extends Nullable{
    public isEmpty(String value) {
        super(value);
    }
    public boolean isEmpty(){
        if(this.getValue()==""){
            return true;
        }
        return false;
    }
    public void printEmpty(){
        if(isEmpty()){
            System.out.println("Empty bir deger donuyor");
        }
        else{
            System.out.println("Empty bir deger donmuyor");
        }
    }
}
