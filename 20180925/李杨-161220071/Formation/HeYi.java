package com.company.Formation;
import java.util.*;
import com.company.BattleField.BattleField;
import com.company.Being.Minion;
import com.company.Being.CalabashBrother;
public class HeYi implements Formation{
    public void setBeing(BattleField field, CalabashBrother[] brother){
        field.battlefield[11][0].being=brother[0];
        field.battlefield[11][0].isEmpty=false;

        field.battlefield[12][1].being=brother[1];
        field.battlefield[12][1].isEmpty=false;

        field.battlefield[13][2].being=brother[2];
        field.battlefield[13][2].isEmpty=false;

        field.battlefield[14][3].being=brother[3];
        field.battlefield[14][3].isEmpty=false;

        field.battlefield[13][4].being=brother[4];
        field.battlefield[13][4].isEmpty=false;

        field.battlefield[12][5].being=brother[5];
        field.battlefield[12][5].isEmpty=false;

        field.battlefield[11][6].being=brother[6];
        field.battlefield[11][6].isEmpty=false;
    }
    public void setBeing(BattleField field, Minion[] minion){
        field.battlefield[11][18].being=minion[0];
        field.battlefield[11][18].isEmpty=false;

        field.battlefield[12][19].being=minion[1];
        field.battlefield[12][19].isEmpty=false;

        field.battlefield[13][20].being=minion[2];
        field.battlefield[13][20].isEmpty=false;

        field.battlefield[14][21].being=minion[3];
        field.battlefield[14][21].isEmpty=false;

        field.battlefield[13][22].being=minion[4];
        field.battlefield[13][22].isEmpty=false;

        field.battlefield[12][23].being=minion[5];
        field.battlefield[12][23].isEmpty=false;

        field.battlefield[11][24].being=minion[6];
        field.battlefield[11][24].isEmpty=false;
    }
}
