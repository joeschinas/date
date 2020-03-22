
package pragramadedatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Pragramadedatas {

  
    public static void main(String[] args) throws ParseException {
       
      Scanner read = new Scanner(System.in);
      SimpleDateFormat dt1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
      
      /*Date date1 = dt1.parse("25/03/2048 15:25:55");*/
        Date date1 = new Date();
      
        System.out.println("datel:"+ dt1.format(date1));
        
        Calendar cal = Calendar.getInstance();
        
        
       cal.setTime(date1);
        System.out.println("data agora"+ dt1.format(date1));
         cal.add(Calendar.DAY_OF_MONTH, 2);
         cal.add(Calendar.MONTH, 7);
           cal.add(Calendar.YEAR, 23);
            date1 = cal.getTime();
       
        
              System.out.println("data agora: "+ dt1.format(date1));
              int minutos = cal.get(Calendar.MINUTE);
                System.out.println("minutos agora: "+ minutos);
                Integer month = 1+ cal.get(Calendar.MONTH);
                  System.out.println("mês atual: "+ month);
                  int years = cal.get(Calendar.YEAR);
                  System.out.println("ANOS:"+years);
        read.close();
        
    }
        
        
       
        
        
    }
    
