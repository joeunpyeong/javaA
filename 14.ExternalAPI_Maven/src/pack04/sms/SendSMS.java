package pack04.sms;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class SendSMS {
	public static void main(String[] args) {
		//Git-hub ����:https://github.com/coolsms/coolsms-java-examples/
		//github������ interface�� ���� class�� �и��� �س��� ����� ���Ⱑ ����.
		
		final String APIKEY ="NCSETJIO9APTNGCU";
		final String APISECRET ="FYUXODBO43RFL0WA0JLVPLJRG3XUBQ2C";
		
		Message sms= new Message(APIKEY,APISECRET);
		
		HashMap<String, String> params = new HashMap<>();
		params.put("to", "01025407141");
		params.put("from", "01025407141");
		params.put("type", "SMS");//SMS,LMS,MMS
		params.put("text", "���� �ڹٷ� ������ �׽�Ʈ��");
		params.put("app_version", "JAVA SDK v1.2");
		
		try {
			JSONObject obj = sms.send(params);
		} catch (CoolsmsException e) {
			e.printStackTrace();
		}
	}
}
