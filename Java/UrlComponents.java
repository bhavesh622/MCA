// Importing URL class
import java.net.URL;

public class UrlComponents {
	// Main driver method
	public static void main(String[] args) throws Exception{
		// Making object of URL type
		// Url taken for consideration as input URL
		URL url = new URL(
			"http://www.bvicam.in/sites/default/files/news/Clarification%20of%20Timing%20for%20MCA-1st%20and%20MCA-2nd%20Shift%20dated%2023-12-2020.pdf");

		// Print the string representation of the URL.
		System.out.println("URL is:" + url.toString());

		// Retrieve the protocol of URL
		System.out.println("protocol is: "
						+ url.getProtocol());

		// Retrieve the filename of URL
		System.out.println("file name is: "
						+ url.getFile());

		// Retrieve the hostname of URL
		System.out.println("host is: " + url.getHost());

		// Retrieve the path of URL
		System.out.println("path is: " + url.getPath());

		// Retrieve the port of URL
                      System.out.println("port is: " + url.getPort());
		System.out.println("default port is: "
						+ url.getDefaultPort());
	}
}
