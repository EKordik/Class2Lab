package model;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author emmakordik
 */
public class WelcomeService {
    private Calendar noon;
    private Calendar evening;
    private String message;
    private static String MORNING_MSG = "Buenos Días";
    private static String MORNING_QUOTE = "\"Morning comes whether you set the alarm or not.\" -Ursula K. Le Guin";
    private static String AFTERNOON_MSG = "Buenas Tardes";
    private static String AFTERNOON_QUOTE = "\"I never drink coffee at lunch. I find it keeps me awake for the afternoon.\" - Ronald Reagan";
    private static String EVENING_MSG = "Buenas Noches";
    private static String EVENING_QUOTE = "\"A good idea will keep you awake during the morning, but a great idea will keep you awake during the night.\" -Marilyn vos Savant";
    private static String LINE_BREAK = "<br><br>";
    public WelcomeService(){
        noon = Calendar.getInstance();
        evening = Calendar.getInstance();
        noon.set(Calendar.HOUR_OF_DAY, 12);      
        evening.set(Calendar.HOUR_OF_DAY, 19);
        
    }
    
    private char getTimeofDay(){
        Calendar now = Calendar.getInstance();
        now.setTime(new Date());

        if(now.before(noon)){
            return 'M';
        }else if(now.after(evening)){
            return 'E';
        }else{
            return 'A';
        }
        
    }
    
    public String getMessage(String name) throws IllegalArgumentException{
        if(name == null || name == ""){
            throw new IllegalArgumentException();
        }
        switch(getTimeofDay()){
            case 'A':{
                message= AFTERNOON_MSG + ", " + name + LINE_BREAK + AFTERNOON_QUOTE; 
            }break;
            case 'E':{
                message=EVENING_MSG + ", " + name + LINE_BREAK + EVENING_QUOTE;
            }break;
            default: {
                message= MORNING_MSG + ", " +  name + LINE_BREAK + MORNING_QUOTE;
            }
        }
        
        return message;
    }
}
