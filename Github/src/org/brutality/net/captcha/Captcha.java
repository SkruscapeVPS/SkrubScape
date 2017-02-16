package org.brutality.net.captcha;

public interface Captcha {

	public Object getKey(int identifier);
	public Object getAnswer();
	public int getExpectedLength();
	
}
