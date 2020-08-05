package Test;
import Library.Util;
public class SendGmail {
    /*
           first Step:
               go to  :
                    https://myaccount.google.com/lesssecureapps?utm_source=google-account&utm_medium=web
                       Make sure that your google account allows third part app
*/
    public static void main(String[] args) {
        // credentials
        String userName = "mahmuterbiz@gmail.com";
        String passWord = "Banu_Torun82";
        // email:
        String[] receivers = {
                "banu.yildirim1892@gmail.com",

        };
        String subject = "Test Automation";
        String text = "Hi How are you? Why you are so ...";
        int times = 5;
        while(times > 0){                           //send the email multiple time
            for( String each : receivers ){         // for sending emails to multiple people
                System.out.println("Sending to: "+each + " "+ times);
                Util.sendEmails(userName,passWord,each, subject,text);
            }
            times--;
        }

        System.out.println("Completed");
    }

}
