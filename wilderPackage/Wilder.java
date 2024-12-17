package wilderPackage;

public class Wilder{

    private String firstName;
    private boolean aware;

    public Wilder(String name,boolean toKnow){
        this.firstName = name;
        this.aware = toKnow;
    }
    
    public String getFirstname(){
        return this.firstName;
    }

    public void setFirstname(String name){
        this.firstName=name;
    }

    public boolean getAware(){
        
        return this.aware;
    }

    public void setAware(boolean toKnow){
        
        this.aware = toKnow;
    }

    public String whoAmI(){
        
        if(this.aware){
            return "je m'appelle "+this.firstName+" et je suis aware";
        }
        else return "je m'appelle "+this.firstName+" et je ne suis pas aware";
    }

}