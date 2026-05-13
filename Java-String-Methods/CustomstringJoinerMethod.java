import java.util.StringJoiner;

class Customjoiner{
    private String delimeter;
    private String prefix;
    private String Sufix;
    private String res = "";

    public Customjoiner(String delimeter , String prefix , String sufix){
        this.delimeter = delimeter;
        this.prefix = prefix;
        this.Sufix = sufix;
        res += prefix;
    }

    public void adder(String x){
        res += x;
        res += delimeter;
    }

    public String toStringC(){
        res = res.substring(0,res.length()-delimeter.length());
        res += Sufix;
        return res;
    }
}


public class CustomstringJoinerMethod {
    static void main(String[] args) {
        Customjoiner sj = new Customjoiner(",", "[", "]");
        sj.adder("uttkarsh");
        sj.adder("chambiyal");
        System.out.println(sj.toStringC());
    }
}
