package site.pers.kl.bean;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * 邮件发送人和密码
 */
public class MailAuthenticator extends Authenticator {

    public static String USERNAME = "";
    public static String PASSWORD = "";

    public MailAuthenticator() {
    }

    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(USERNAME, PASSWORD);
    }

}
