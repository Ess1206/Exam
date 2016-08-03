/**
 * Created by Stan on 01.08.2016.
 */
abstract public class  OverWrideMethods {

    public void OverWrideMethods0(){
    }
    public void OverWrideMethods1(){
    }

    public String reloadString(){
        String s = "1  "+ " 2 " ;

        return s;
    }

    public abstract String reloadString(int i);
}

class getOverload extends OverWrideMethods {

    @Override
    public String reloadString(int i) {
       String string = i + " = i";

        return string;
    }
}