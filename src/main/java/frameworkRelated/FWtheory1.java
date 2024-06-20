package frameworkRelated;

public class FWtheory1 {
	/*
	 * FrameWork:systematic way of designing the appn/components and these components are talking
	 * to each other and they are integrated somehow and we have created lot of reusable fns so that
	 * we avoid duplication of code again and again
	 * FW: would help me to debug the code properly later on, help me to maintain the code properly
	 * when u add more and more TCs in the future
	 * Plus if any bug/defect is there in the FW - one should be able to debug the code to solve
	 * the problem
	 * if login() method --we can call it whenever required
	 * if click() method is there we can call it whenever there is the need of it
	 * Need of FW: cannot write 100 TCs in one single line of code,we need to write reusable code,
	 * need to write some utilities,-BrowserUtility,ElementUtility, JSutility, String Utility
	 * Need to write the Tcs separately,need to write page classes separately, have to avoid the 
	 * hard coded data, have to maintain the test data properly, have to attach the screen shots,
	 * need to generate the reports,
	 * have to initialize the browser on the basis of browser, have to supply the configuration data
	 * soo lot of different components we have to design
	 * The first step is to create HLD-high level design
	 * ==> writing no of components - mentioning the functionality of each component in the FW
	 * how exactly it is going to integrate in the FW
	 * 
	 * DataDriven FW, KeyWordDriven FW, ---the terminologies in the market
	 * These are not FWs, these are design patterns
	 * 
	 * Keyword driven framework: almost gone from market
	 * POM: is not FW, is a design pattern, is a kind of approach
	 * POM cannot be used for backend api automation - since api automation is for CRUD operations
	 * those are only apis-there is no UI
	 * 
	 * POM is applicable only for UI automation
	 * According to POM model: it says for every page u have to create a separate class
	 * for each page respective dot java class needs to be created
	 * ADVANTAGE: the maintainance of the code will be very easy
	 * tomorrow there is any issue with the xpath of login page submit btn-i would go to that class
	 * and fix it
	 * --any issue with addToCart btn --can go to the accounts page class and fix the locator 
	 * --so reusability plus segregation of diff page locators will be systematically done with the
	 * help of page layer
	 *1. PAGE LAYER:
	 * --we have to create a page layer--and in the page layer -- have to create no of classes for 
	 * each page
	 * --every class will be representing a specific page
	 * THESE PAGES ARE THE CLASSIC EXAMPLES OF ENCAPSULATION:**************************
	 * means we maintain the By locators using the private keyword to achieve ENCAPSULATION
	 *i) => private By locators
	 *ii) public page constructors -- using this key word in the body of constructor
	 *iii) public page Actions/methods--internally these page actions use the private By locators
	 * 
	 * 2.TEST LAYER:
	 * where we maintain the test classes for each individual page
	 * we will write diff @annotations, @Test for TCs, will see AAA pattern here
	 * AAA:AssertAct
	 * pre-condition: here is every class has @Test along with assertions
	 * and the pre-conditions are written in @Before annotation
	 * post-conditions in @After annotation
	 * For these we will maintain one base page so as to avoid duplication of code
	 * the pre-conditions, post-conditions come from the BaseTest.java class
	 * All the pageTest classes extend the BaseTest.java
	 * 
	 * 
	 * DRIVER FACTORY: 
	 * which kind of acts as a BrowserUtility class==> All browser related work goes here
	 * --which launches the browser
	 * --launches the url
	 * --gets the title of the page to validate
	 * --gets the current url of the page --need to write a generic for all the api basic methods
	 * --also helps in local + Remote initialization of webdrivers
	 * for local execution of tcs as well as for GRID==> parallel execution of tcs
	 * 
	 * CONFIG.PROPERTIES:helps to run TCs on multiple environments
	 * to add all the config properties===> urls for each environment
	 * diff browsers info, username, password, 
	 * have to read this file with the help of initProperties() method written in the DRIVER FACTORY
	 * 
	 * EXCEL FILE UTILITY: to maintain the test data
	 * using apache poi apis we create DATA PROVIDERS(DPs) 
	 * 
	 * TEST RUNNERS:
	 * ==> testng.xmls --multiple of them 
	 * for sanity.xml, regression.xml, chrome.xml etc...
	 * TESTNG.XML: in this file we maintain no. of blocks --for parallel execution--to run all the
	 * tcs in diff environments(GRID)
	 * we create the entries for all the testng Tests.java in the testng.xml file
	 * 
	 * REPORTS:
	 * reporting means we have to generate the logs-using log4j api
	 * --By default testng provides 2 reports--testng.html, index.html,emailablereport.html
	 * ----these reports are not that good so we need to integrate some very powerful reports like
	 * allure, extent reports etc...
	 * --we will customize some features, like screen shots etc with proper description and add 
	 * them in these reports
	 * how will u create these reports?? --with the help of testnglisteners
	 * --will add 2 diff types of Listeners: Allure listeners and Extent Report Listener
	 * --will try to implement the retry logic also==> if the test is getting failed give one more
	 * chance
	 * 
	 * what kind of project are we using here?? java OR maven
	 * Obviously for all of these components/features with so many functionalities we need many 
	 * diff dependencies/libs
	 * along with java, we need testng, sel, apache poi apis, extent report, allure report, log4j
	 * --for that obviously we need one pom.xml file for which we need to create one maven prj
	 * --and then we will add all the libs in the pom.xml
	 * --------------AND NOW WE UNDERSTAND THE IMP OF PLUGINS HERE---------------
	 * with the help of plugin-------we will try to achieve the maven life cycle
	 * MAVEN LIFE CYCLE:
	 * 3 components features--build the tcs,resources==> packaging into fat jar files, deployment
	 * how to deploy the project
	 * 
	 * EXECUTION: of TCs happens only in the local and after that we have to add lot of DeVops 
	 * activities as well
	 * 
	 * finally we need to understand where exactly in POM we can fit Cucumber
	 * 
	 * 
	 * THE FW IS DEVELOPED AND NOW WE HAVE TO PUSH THE CODE: GITHUB
	 * THEN CREATE ONE JENKINS SERVER(for CICD point of view)
	 * JENKINS: not only for CICD, jenkins is for individual jobs also
	 * --will create some pipelines also CICD, automation PL,Blue Ocean PL, Declarative PL syntax
	 * jenkins will take the code from the GIT repository and will start running the tcs
	 * BUT again where exactly browser will be launched--ON THE JENKINS SERVER MACHINE
	 * 
	 * is it a GOOD practice?? No it is a bad practice if jenkins takes the code from LOCAl
	 * ---HAS TO BE FROM GITHUB
	 * we should never run the UI automation tcs on jenkins server--since jenkins is a common 
	 * jENKINS: IS JUST TO TRIGGER UR JOBS AND TO TRIGGER UR TEST CASES
	 * at the org level they do not let the QA team run tcs on Jenkins server
	 * --the tcs should be run on a diff machine--either it could be a VM or a Cloud or may be a
	 * diff hardware
	 * here Docker Hub comes into pic---this is where the tcs are run when jobs on jenkins triggered
	 * ---Docker container does it 
	 * ---Docker composer GRID
	 * ---Selenoid GRID: helps to create
	 * multiple chrome browsers
	 * browser lab==> n no of browsers with diff versions
	 * which sel class/top casting should be used to run the tcs on diff machine or on the cloud???
	 * WD driver= new remote webdriver(url, desiredCapabilities);
	 * 
	 * NGROK: is like a proxy--acts like a mediator between Github and the jenkins
	 * WEBHOOK: is a feature of GitHub--will sense the push happened onto GitHub and sends an event
	 * to the NGROK proxy server and the NGROK proxy server--will say there is a push happened
	 * --so run this job/PipeLine on the server---immediately jenkins will be activated and will
	 * trigger that particular job
	 * 
	 * src/main/java---all the other things-utilities, pageClasses, 
	 * src/test/java ---only for tcs
	 * src/test/resources--create folders(not java related) not packages
	 * all testrunners, properties file
	 * 
	 * we will not use main method at all
	 * 
	 * project-rightclick-properties ---go into the projects directory 
	 * open the command prompt from there
	 * enter tree cmd
	 * take the screen shot of the folder structure--and can add to the confluence pages/wicki pages
	 * 
	 * 
	 */

}
