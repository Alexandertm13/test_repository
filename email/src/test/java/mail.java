import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 * Created by alexander.kotov on 12.01.2018.
 */
public class mail {
 public static void main(String[] args) throws EmailException {

   System.out.println("=======Test Started=======");

   sendEmail();


   System.out.println("=====email send=======");
}

  public static void sendEmail() throws EmailException {
    Email email = new SimpleEmail();

    email.setHostName("smtp.gmail.com");

    email.setSmtpPort(465);

    email.setAuthenticator(new DefaultAuthenticator("tm13.msk@gmail.com", ""));
    email.setSSLOnConnect(true);
    email.setFrom("maria.dronina@givc.mkrf.ru");
    email.setSubject("TestMail");
    email.setMsg("hi world!");
    email.addTo("maria.dronina@givc.mkrf.ru");
    email.send();
  }
}
