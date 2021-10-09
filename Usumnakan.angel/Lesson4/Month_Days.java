package Lesson4;

public class Month_Days {
    public static void main(String[] args) {

        int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String month_months[ ]= new String [12];
        {
            for (int i = 0; i < 12; i++){
                //for(int j=0; j<11; j++) {

                month_months[0] = "hunvar";
                month_months[1] = "petrvar";
                month_months[2] = "mart";
                month_months[3] = "april";
                month_months[4] = "mayis";
                month_months[5] = "hunis";
                month_months[6] = "hulis";
                month_months[7] = "ogostos";
                month_months[8] = "september";
                month_months[9] = "hoktember";
                month_months[10] = "noyember";
                month_months[11] = "dektember";

                System.out.println(month_months[i] +"-n " + " uni " + month_days[i] + "or");
            }

        }
    }
}