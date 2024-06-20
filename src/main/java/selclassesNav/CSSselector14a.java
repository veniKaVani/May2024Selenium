package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector14a {
     static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("app.hubspot.com/login");
		
		/*
		 * Every browser has an xpath engine and all browsers have diff engines
		 * 
		 *  id
		 *  #id
		 *  tagname#id
		 *  #username
		 *  input#username
		 *  
		 *  class:
		 *  .class
		 *  tagname.class
		 *  .login-email
		 *  input.login-email
		 *  
		 *  class + id
		 *  .class#id
		 *  #id.class
		 *  input.login-email#username
		 *  input#username.login-email
		 *  
		 *  .c1.c2.c3......cn
		 *  tagname.c1.c2.c3....cn
		 *  .form-control.private-form_control.login-email
		 *  input.form-control.private-form_control.login-email
		 *  input.form-control.private-form_control.login-email#username
		 *  input.form-control
		 *  
		 *  with attributes: css selector
		 *  tagname[attr='value']
		 *  no @ symbol needed for css selector
		 *  input[name='email']
		 *  input[id='input-email']
		 *  
		 *  for multiple attributes: in xpath we used to use 'and'
		 *  BUT for css selector we just need multiple [] for diff attri values
		 *  input[id='input-email'][type='text'][name='email']
		 *  input#input-email[type='text'][name='email']
		 *  
		 *  for contains-use the special character *
		 *  for starts-with: use ^
		 *  ends-with is available in css and special charac we use is $
		 *  
		 *  input[placeholder*='Address'] ---contains
		 *  input[placeholder^='E-mail'] ---starts with
		 *  input[placeholder$='Address'] ----ends-with
		 *  
		 *  text in css: Not available
		 *  
		 *  parent to child concept in css: Yes
		 *  form#hs-login > div --->direct child     ==>here > does it
		 *  form#hs-login div --->direct + indirect child ==>space does the work
		 *  
		 *  select#Form_getForm_Country > option
		 *  select#Form_getForm_Country  option
		 *  
		 *  child to parent:not allowed in css-backward traversing not allowed
		 *  child to grand parent--also not allowed
		 *  preceding sibling: not allowed
		 *  
		 *  sibling in css:
		 *  label[for='input-email']+input-email --immediate following sibling
		 *  
		 *  option[value='Algeria']+option ---immediate following sibling --1
		 *  option[value='Algeria'] ~ option -- -- all following sibling --more
		 *  
		 *  for css -- u have to remember so many special characters--what they are for
		 *  
		 *  can write comma as well in CSS:
		 *  input#username,input#password,button#loginBtn,input#remember
		 *  the above css selector comma separated gives 4 diff elements
		 *  
		 *  not in css:
		 *  div.form-group > input.form-control:not(#input-email)
		 *  
		 *  index in css:Orangehrm-countryDrDown
		 *  select#Form_getForm_Country > option:nth-of-type(6)
		 *  select#Form_getForm_Country > option:nth-of-type(n) --all
		 *  
		 *  all css selectors for selecting eles on orangehrm dr down:
		 *  select#Form_getForm_Country > option:first-child
		 *  select#Form_getForm_Country > option:last-child
		 *  select#Form_getForm_Country > option:nth-child(4)
		 *  select#Form_getForm_Country > option:nth-last-child(2)
		 *  select#Form_getForm_Country > option:nth-child(even)
		 *  select#Form_getForm_Country > option:nth-child(odd)
		 *  select#Form_getForm_Country > option:nth-of-type(n+4)
		 *  select#Form_getForm_Country > option:nth-of-type(5n)
		 *  
		 *  
		 *  odd and even in xpath:
		 *  (//select[@id='Form_getForm_Country']/option)[position() mod 2 =1] --odd
		 *  (//select[@id='Form_getForm_Country']/option)[position() mod 2 =0] --even
		 *  
		 *  cascaded classes in CSS:=>multiple classes in css- Yes
		 *  tagname.c1.c2.c3......cn
		 *  
		 *                           xpath          vs         css
		 *  1.performance            good                      good
		 *  2.syntax                 complex                   simple
		 *  3.backward traversing     yes                       no
		 *  4.sibling:                yes                       yes --only following
		 *  5.text:                   yes                       no
		 *  6.ancestor/parent:        yes                       no
		 *  7.ends-with:              no                        yes
		 *  8.index:                  yes                       yes+1
		 *  9.not:                    yes                       yes
		 *  10.comma:                 no                        yes
		 *  11.SVG:                   yes                       no
		 *  12.shadow:                no                        yes
		 *  13.Pseudo:                no                        yes
		 *  14.last:                  yes                       yes
		 *  15.first:                 no                        yes
		 *      
		 *  inspect subscribe yes no btns to see
		 *   " yes"
		 *   " No"
		 *   //label[normalize-space()='No']                                    
		 *  
		 */
		int mand_fields_count = driver.findElements(By.cssSelector("input#username,input#password,button#loginBtn,input#remember")).size();
		
		

	}

}
