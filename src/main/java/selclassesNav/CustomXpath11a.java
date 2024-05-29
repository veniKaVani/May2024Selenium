package selclassesNav;

public class CustomXpath11a {

	public static void main(String[] args) {
		/*
		 * Xpath: address of the element in the DOM
		 * ---also known as XmlPath 
		 * there are 2 types:
		 * 1. absolute xpath(full xpath): has single slashes--need to be avoided as risky
		 * --they might break, tomorrow it might change when more elements are embedded
		 * 2. relative xpath(custom xpath):better than absolute
		 * 
		 * 2. i)using any single attr:
		 *   //tagname[@attr='value']
		 *   
		 *   ii)using multiple attrs:
		 *   //tagname[@attr1='value' and @attr2='value' and @attr3='value']
		 *   
		 *   iii) text()
		 *   //tagname[text()='value']
		 *   
		 *   iv) text() and attributes:
		 *   //tagname[@attr='value' and text()='value']
		 *   
		 *   v) using contains() with attr
		 *    when using contains()--the attr and value must be separated by commas and not equal to
		 *    //tagname[contains(@attr, 'value')]
		 *    
		 *   vi) using contains() with text()
		 *   //tagname[contains(text(),'value')] 
		 *   
		 *   vii)using contains() with text() and also @attr
		 *   //tagname[contains(text(),'value') and contains(@attr1,'value') and @attr2='value']
		 *   
		 *   viii)starts-with()
		 *   //tagname[starts-with(@attr, 'value')]
		 *   
		 *   ix)starts-with() with text()
		 *   //tagname[starts-with(text(),'value')]
		 *   
		 *   x) ends-with() ?? is not supported in sel 4
		 *   all modern browsers support only starts-with()
		 *   
		 *   xi) index based xpath
		 *   capture group==>put the complete xpath in a () and then put a [] which has index
		 *   (//tagname[text()='value')][2]
		 *   
		 *   the right way of using index based xpath is
		 *   always put the entire xpath in () and then put [] which has index in it
		 *   
		 *   we should avoid index based xpath as much as possible
		 *   can also write the index no inside the [] using position()=indexno
		 *   
		 *   (//tagname[@class='value')][position()=3]
		 *   
		 *   just like position() there is last() as well which represents the last position
		 *   
		 *   (//tagname[@class='value')][last()=3]
		 *   
		 *   can also write last()- 3 ...etc
		 *    
		 *   HW: write a program to check to see the Help is the last element on footer link 
		 *   
		 *   xii) //*---IS IT A RIGHT XPATH?? YES
		 *   ===>give me all the elements on the DOM--it starts from the begining--it will go
		 *   to each and every element--opens up every thing on the DOM
		 *   
		 *   //*[@id] 
		 *   ==> give me all the elements where @id is available
		 *   
		 *   //*[@class='form-control']
		 *   //input[@class='form-control']
		 *   WHICH XPATH IS FASTER AMONGST THE ABOVE TWO XPATHS??
		 *   
		 *   //input[@class='form-control']  is faster since it goes direct to the element
		 *   and does not traverse to each individual element as * is not present
		 *   Avoid the xpath with asterisk(*) as it takes much time since it traverses to each
		 *   and every element
		 */

	}

}
