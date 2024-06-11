package selclassesNav;

public class SelTheory1a {

	public static void main(String[] args) {
		/*
		 * we cannot write a single line of code without sel
		 * how exactly sel works??
		 * The timeLine that we see with sel
		 * 
		 * 
		 * SELENIUM: is for automating browsers-web browser automation
		 * -----just simulates user actions on the browser
		 * ----it cannot validate any thing
		 * ---is completely open source and free
		 * ----the source code of sel is completely visible to everyone--so they can download
		 * and customize it for their own purpose
		 * ----it supports multiple browsers-egs: chrome, firefox, edge, brave, Tore, safari
		 * ----it supports diff programming languages-java, python, Ruby, JS, Php, Perl, Go
		 * ----sel is having its own Grid-it supports parallel run on the cloud,remote, AWS
		 * server
		 * 
		 * 
		 * 
		 * SEL + Testng: can do validations plus user action simulation on browsers
		 * 
		 * TESTERS: should use other external tools for validation==>
		 * sel + testng---to test and do validations of user actions on browsers
		 * 
		 * PROS:Advantages of Selenium
		 * nav notes:Sel is
		 * 1.opensource + free
		 * tools can be opensource and free--eg:selenium
		 * some tools can just be free but not open source
		 * eg: eclipse ==> eclipse source code not visible to every one
		 * 2. supports multiple browsers:chrome, firefox, edge, brave, Tore, safari
		 * 3. supports diff prog languages: Java, Python, Ruby, JS, Perl, Php, Go,C#
		 * 4. Selenium is having its own GRID: supports parallel run on cloud, remote, AWS SErver
		 * 5. W3CwebDriver protocols/standards
		 * 6. it supports various locators to find the eles on the page:xpath, css, linktext,
		 * 7. wait mechanism: it is proven that sel wait is the best wait 
		 *   appn(slow) -- script(wd) is not going to wait and throw exception
		 *   -custom wait: imp/exp wait /fluent wait
		 *   so we have to add the waits so sel waits for the appn to load
		 *   ==> we have to sink the appn with the script
		 * 8. cross platform OR cross operating system:windows/macos/Linux
		 *   BUT sel doesnot support unix os 
		 * 9. it supports headless/headed mode
		 *   headless ==> no visualization
		 *10. it is completely RAW library: u can customize as per ur reqment
		 *  u can create wrappers/generic fns on top of sel apis
		 *  u design according to ur own requirement==> create ur own utilities using generic fns
		 *11. supports major unit testing frameworks:
		 *  Java: testng/Junit
		 *  C#: Nunit
		 *  Python: Pytest/unittest
		 *  Php: Phpunit  
		 *12. BDD: QA/Dev/PO -- plain eng/common lang requirement/features: Cucumber, RSspec, Jbehave
		 * Cucumber is not a framework, it is a simple lib that supports BDD.
		 *13.SELENIUM: it is super easy to integrate sel with the tools available in the market
		 * integration with external tools/libs: other external lib
		 *tomorrow if the user wants to generate logs -- can integrate with log4j
		 *to write TC's --can integrate with testng
		 *to achieve some Devops activities: some infrastructure set up --can use sel with jenkins to design
		 * CICD pipelines
		 * to run the jobs on AWS cloud
		 * to integrate with Maven-so i can generate the jar, fat jar files, so to do the deployment on Nexus
		 * server
		 * easy to integrate with GitLab, GitHub, etc..
		 * you want to run the TC's from one machine to another machine--u can do it
		 *to generate some fancy report --can integrate with reporting tools/libs like extent report etc...
		 *14. only for functional testing  
		 *15. cross origin policy/cross domain navigation
		 *sel supports cross origin policy/cross domain navigation 
		 * ==> on one domain appn ---u will have links so as to go to some other domain appns
		 * egs: from one appn:--u can go to other social websites like facebook, linkedin, youtube, instagram    
		 * 16.CDP: Chrome Dev protocols --with these we can do some testing
		 * 17.shadow DOM/frames/svg/pseudo elements/ajax: yes
		 *
		 * CONS: Disadvantages of SEl:
		 * what we cannot do with sel
		 * 1. cannot automate windows/desktop/OS appns
		 * 2. mobile apps: ios/android/ms --we need to use appium-appium internally uses sel
		 * 3. performance testing: not recommended
		 * 4. security testing: no
		 * 5. hardware testing: bluetooth devices, raspberry devices, py devices cannot be automated
		 * 6. captcha/bar code: no
		 * you should never automate a captcha--since it is a violation
		 * captchas are meant to block automation being done
		 * you should ask the devs to remove the captcha so you can test the application
		 * 7. OTP: no
		 * 8.AI testing: no
		 * 9.Accessibility testing: no
		 * there are 90 % of the people who are physically impaired, they have to feel the appn and use it
		 * eg: after 5 tabs on amazon appn, user reaches the search bar
		 * need to integrate with external libs like DQ and then we can do it
		 * 10. email/mail reader
		 * 11. API testing: no
		 * 12. read files: word/PDF: no
		 * 100% automation is a myth
		 * 13.images testing:no
		 * most of the time we do images testing -thru manual testing only
		 * 14.UI testing: look and feel:limitations:alignments-no, spaces between two eles...
		 * so avoid alignment related TC's
		 * yes: fontsize, width, height, color
		 * 15.integrate with DB: no --but can be done with lang(java)
		 * 16.salesforce sf/ERP/:limitations
		 * 17.Canvas: HTML 5: no...delphi: silverlight:no  
		 * 
		 * Web appn(23c) --chrome(w3c) --testing tool(selenium WD - w3cwebdriver)
		 * Major ADvantage: browser is w3c standard, the tool(sel)=>WebDriver is w3c certified
		 *   and also the appn is w3c standard, WebDriver is w3c standard
		 *   ---the major advantage of this deadly combination is the COMPATIBILITY
		 *   --the user simulation--99 percent of it is exactly w3c standard
		 * 
		 * Introduction-to-Selenium-13.png
		 * the opponent to sel is QTP(Mercury)
		 * selenium RC --deprecated
		 * 1.sel IDE --record n play tool
		 * 2.sel RC --also called sel 1.
		 * 3.webdriver + selenium 1(RC):Selenium WebDriver(selenium 2)
		 *  --selenium 2-->selenium 3(w3c) ---> selenium 4(w3c) ---> selenium 5(w3c+webdriver Bidi)
		 * 4.Selenium GRID
		 * 
		 * 
		 * what is the diff in sel 2 and sel 3??
		 * From sel 3 - it became w3c standard + browser binary management)
		 * until sel 2-the browser executable file need to be managed by the user
		 * downloading it on to the local file system and then writing the path of the .exe
		 * in the System.setProperty(webdriver.chrome.driver, "path to the exe file");
		 * 
		 * can the script written interact with the browser without any intermediate server?? no
		 * the intermediate component used until sel 2 JSON server/json wire protocol
		 * the no.of intermediate browser servers needed were - 4(cd server,GDserver,edge,IE server)
		 * for every browser--there is a separate browser server
		 * 
		 * JSON wire protocol: means whenever any interaction to be done with the browser, i have to write
		 * the code which gets converted to JSON form and is given to the server and then to the browser
		 * upto sel 3.7 they were using json wire protocol
		 * 
		 * from sel 3- the browser driver management was given to vendors(browser companies)
		 * the browser companies also become w3c compatible
		 * sel is not taking care of the browser management--given to vendors
		 * sel 3 became w3c from sel 3.8(w3c webdriver protocol)
		 * 
		 * sel 4: sel 2 + sel 3 features + more new features
		 * sel 4.6 onwards--they released SM => sel manager
		 * 
		 * Google Search w3c and read about it
		 * w3c: is a kind of platform,it is a kind of standar, it is a kind of protocol--which
		 * is having all the guidelines
		 * 
		 * GRID: what is Grid??
		 * run ur script(written with sel 4.x) run it on the remote machine: cloud, laptop/hw/machine, server,
		 * VM
		 * 
		 * 2 types of executions: local, remote
		 * remote exec: grid will come into pic along with the parallel run
		 * 
		 * local: developing: chrome
		 * remote: grid + parallel run(chrome/firefox/edge)
		 * 
		 * security testing: security means leakage of data, from payment history logs
		 * is done from the backend : so backend is imp and not the UI
		 * 
		 * POC: design some basic TC's with diff work flows
		 * and then integrate with basic frame work and then generate the report
		 * show it to the client
		 * mention the limitations of the tool:
		 * what cannot be automated, in scope and out of scope
		 * 60% coverage is also kind of good automation
		 * 
		 * ROI:
		 * 
		 *  the code is really testing the appn and finding the bugs or not
		 *  
		 *  custom grids: selenoid, docker grid, browser lab on AWS
		 * 
		 */

	}

}
