package pack05.email;

import java.net.URL;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {
	public static void main(String[] args) {
		SendEmail se=new SendEmail();
		se.sendSimple();
		//se.sendMulti();
		//se.sendHtml();
	}
	//1.단순하게 테그트만 있는 이메일:SimpleEmail
	//2.첨부파일이나 url등으로 이미지가 있는 이메일: MultiPartEmail
	//3, 모든 기능을 가지고 html태그까지 사용가능한 이메일:HtmlEmail
	
	public void sendSimple() {

		SimpleEmail mail = new SimpleEmail();
		//smtp.naver.com
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8");//한글깨짐 방지
		mail.setDebug(true);//오류를 찾아서 개발을 하고있는 과정인지
		
		mail.setAuthentication("jep3503", "asdf1278");
		mail.setSSLOnConnect(true);
		//=======================고정 어떤 메일을 쓰든 smtp서버와 smtp서버를 이용할 수 있는 고객인증
		
		try {
			mail.setFrom("jep3503@naver.com","setFrom");
			
			mail.addTo("jep3503@naver.com","addTo");//여러개하면 여러명한테 전송
			
			mail.setSubject("회원가입 축하 메세지");
			mail.setMsg("내용입니다");
			
			//mail객체가 모든 정보를 가지고 전송할 준비를 마침
			mail.send();
			
		} catch (EmailException e) {
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Email오류 아닌거"+e.getMessage());
		}
		
		
		
		
	}
	
	public void sendMulti() {

		MultiPartEmail mail = new MultiPartEmail();
		//smtp.naver.com
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8");//한글깨짐 방지
		mail.setDebug(true);//오류를 찾아서 개발을 하고있는 과정인지
		
		mail.setAuthentication("jep3503", "");
		mail.setSSLOnConnect(true);
		//=======================고정 어떤 메일을 쓰든 smtp서버와 smtp서버를 이용할 수 있는 고객인증
		
		try {
			mail.setFrom("jep3503@naver.com","한울JEP");
			
			mail.addTo("jep3503@naver.com","한울JEPTO");//여러개하면 여러명한테 전송
			
			mail.setSubject("회원가입 축하 메세지");
			mail.setMsg("내용입니다");
			
			EmailAttachment file = new EmailAttachment();
			file.setPath("C:\\Users\\admin\\Desktop\\뱂.jpg");//이미지파일 경로를 넣어줌.
			mail.attach(file);
			
			file=new EmailAttachment();
			file.setURL(new URL("https://www.digimonmasters.com/images/header/visual_bg_dig02.png"));
			mail.attach(file);
			
			//mail객체가 모든 정보를 가지고 전송할 준비를 마침
			mail.send();
			
		} catch (EmailException e) {
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Email오류 아닌거"+e.getMessage());
		}
	}

	public void sendHtml() {

		HtmlEmail mail = new HtmlEmail();
		//smtp.naver.com
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8");//한글깨짐 방지
		mail.setDebug(true);//오류를 찾아서 개발을 하고있는 과정인지
		
		mail.setAuthentication("jep3503", "");
		mail.setSSLOnConnect(true);
		//=======================고정 어떤 메일을 쓰든 smtp서버와 smtp서버를 이용할 수 있는 고객인증
		
		try {
			mail.setFrom("jep3503@naver.com","한울JEP");
			
			mail.addTo("jep3503@naver.com","한울JEPTO");//여러개하면 여러명한테 전송
			mail.addTo("youngmoon525@naver.com","한울JEPTO");//여러개하면 여러명한테 전송
			
			mail.setSubject("회원가입 축하 메세지");
			//메일의 내용이 일반 글자가 아니라 html형태로 보낼것이기 때문에 바꿈
			StringBuffer msg = new StringBuffer();//"A","A"+"B"
			msg.append("<html>");
			msg.append("<body>");
			
			
			msg.append("</body>");
			msg.append("</html>");
			
			mail.setHtmlMsg(msg.toString());
			
			
			
			EmailAttachment file = new EmailAttachment();
			file.setPath("C:\\Users\\admin\\Desktop\\뱂.jpg");//이미지파일 경로를 넣어줌.
			mail.attach(file);
			
			file=new EmailAttachment();
			file.setURL(new URL("https://www.digimonmasters.com/images/header/visual_bg_dig02.png"));
			mail.attach(file);
			
			//mail객체가 모든 정보를 가지고 전송할 준비를 마침
			mail.send();
			
		} catch (EmailException e) {
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Email오류 아닌거"+e.getMessage());
		}
		
		
		
		
	}


}

