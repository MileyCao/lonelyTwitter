package ca.ualberta.cs.lonelytwitter;
import java.util.Date;

/*
 name: Yun Cao  ID: 1547251
 */
public abstract class Mood {
    public String mood;
    private Date date;

    public Mood(){
        mood = "";
    }

    public void setDate(){
        this.date = new Date();
    }

    public String getDate(){
        String dateTime = "";
        dateTime = this.date.toString();
        return dateTime;
    }

    public abstract void sendMood();
}

