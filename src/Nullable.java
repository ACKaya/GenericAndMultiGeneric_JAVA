public abstract class Nullable  {
    private final String value;

    public Nullable(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    public boolean isNull(){
        if(this.getValue()==null){
            return true;
        }
        return false;
    }
    public void print(){
    if(isNull()){
        System.out.println("Null bir deger donuyor");
    }
    else{
        System.out.println("Null bir deger donmuyor");
    }
    }
}
