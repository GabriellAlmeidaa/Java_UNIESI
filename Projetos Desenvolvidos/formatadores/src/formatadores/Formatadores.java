package formatadores;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class Formatadores {

    public static void main(String[] args) throws ParseException {
        Calendar c = Calendar.getInstance();
        c.set(1999, Calendar.OCTOBER, 2);
        Date data = c.getTime();
        System.out.println(data);
        
        DateFormat df = DateFormat.getDateInstance();
        System.out.println(df.format(data));
        
        DateFormat hf = DateFormat.getTimeInstance();
        System.out.println(hf.format(data));
        
        DateFormat dhf = DateFormat.getDateTimeInstance();
        System.out.println(dhf.format(data));
        
        DateFormat de = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(de.format(data));
        
        de = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(de.format(data));
        
        de = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(de.format(data));
        
        de = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(de.format(data));
        
        Date dt = de.parse("22/09/2020");
        System.out.println(dt);
    }
    
}
