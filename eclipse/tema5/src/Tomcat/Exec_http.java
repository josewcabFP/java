package Tomcat;

/* Exec_http.java - Launches a web page
*
* Usage: Exec_http URL [arg1 [arg2 [...]]]
* where URL is without "http://"
*
*/

import java.io.*;
import java.net.*;

public class Exec_http {
	
	public static void main(String[] vargs) throws java.net.MalformedURLException, java.io.IOException {
		String dest = "http://";
		if (vargs.length <= 0) {
			System.out.println("Usage: Exec_http page [args]");
			System.exit(1);
		} else {
			dest += vargs[0];
			for (int k = 1; k < vargs.length; k++) {
				dest += ((k == 1) ? "?" : "&") + vargs[k];
			}
		}
		System.out.println(dest);
		URL url = new URL(dest);
		Object obj = url.getContent();
		InputStream resp = (InputStream) obj;
		byte[] b = new byte[256];
		int n = resp.read(b);
		while (n != -1) {
			System.out.print(new String(b, 0, n));
			n = resp.read(b);
		}
	}
}
