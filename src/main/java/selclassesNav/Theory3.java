package selclassesNav;

public class Theory3 {

	public static void main(String[] args) {
		/*
		 * how exactly is sel interacting with the browser??
		 * comes under the sel architecture.
		 * there are 3 components when this happens
		 * i) the ide-eclipse/intelliJ where the srccode/in java/python/Ruby/Php/anyLang is there
		 * ==> local machine
		 * src code is kind of client--which is giving the request in the form of code
		 * WD driver =new ChromeDriver();
		 * ii) the browser server which is of w3c standard
		 * interaction to the browser cannot be done directly--needs a mediator--which is a server
		 * in the form of drivers/.exes/binaries---provided by the VENDORS(of the browsers)
		 * there could be 3 servers for the 3 browsers-chromedriver.exe, geckodriver.exe, edgedriver.exe
		 * server understands only the apis==>getTitle(), quit(),
		 * for every request--it follows the w3c standard protocol --when creating the request, then the
		 * APIs interacting with the server and ultimately the browser responding
		 * iii) the real browsers-chrome/ff/edge...etc
		 * 
		 * what is the server and how exactly it is getting launched??
		 * until sel 3/4.50 --manually downloading the .exec
		 * selinium 4.6.0: automatically downloading the .exec files
		 * who is managing the .exe files --By the vendors of the browsers
		 * chromedriver.exe is available on their own official website
		 * edgedriver.exe ---on their official website
		 * ff ---on their official website
		 * 
		 * if u r using the browser version 100
		 * then u need 100 version of driver.exe file --needs to be downloaded
		 * sel 4.6 -- will automatically checks the browser version
		 * then it goes and checks in the CACHE of ur local file system: .cache file if the dot exe is 
		 * already there and if not -- does download and store it there in the .cache directory and takes
		 * it from there and uses it--doing the job of webdriver manager
		 * and so is being called as selenium manager(new terminology/feature after sel 4.6.0)
		 * it does for all respective browsers --the respective .exe files
		 * 
		 * if the version of the browser is downgraded to 90 --then the .executable needs to be downloaded
		 * --will go and check in the official website--download it and use it
		 * 
		 * the older binaries/.exes will not be deleted from the .cache file of the local system
		 * 
		 * All respective browserdriver dot executable files are stored under users/.cache/drivers folder
		 * of the local file system from where the code interacts with the browser server
		 * 
		 * after driver.close() or driver.quit()
		 * u write any code for eg: system.out.println("abc"));//gives NoSuchElementException
		 * first used case:
		 * ==> the browser is closed but the server is still running--
		 * after driver.close(); ---the server will be running in the background
		 * ----and the session id still remains same and gives the exception--invalidsessionid
		 * second used case:
		 * if driver.quit(); --the session id was 123
		 * driver.getTitle(); --NoSuchSessionException  BUT session id would be null
		 * 
		 * what is the diff between close() and quit()??
		 * session id after quit() ---null
		 * session id after close()--same session id but invalid
		 * Soln: we should never use the driver after dot quit() OR dot close()
		 * Both the cases will give NOSuchElementException
		 * 
		 */

	}

}
