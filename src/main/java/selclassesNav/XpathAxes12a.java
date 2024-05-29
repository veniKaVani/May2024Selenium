package selclassesNav;

public class XpathAxes12a {

	public static void main(String[] args) {
		/*
		 * if the child element is directly associated --we go with single slash
		 *  //form/div
		 * parent to direct child: /  one forward slash
		 * parent to direct + indirect child: // two forward slashes
		 * -----will collect both direct plus indirect
		 * ---double slash can be used with the direct also, can be used with indirect also
		 * OR the combination of both direct + indirect
		 * //div[@id='content']//img   gives 2/3
		 *  // will be having more count as it goes to both direct and indirect children
		 *  
		 *  CHILD TO PARENT NAVIGATION: ==>backward traversing --possible with xpaths
		 *  ==> go back to the parent--either direct or indirect-->   /..
		 *  /.. traverses backwards to the direct parent
		 *  /../../.. looks little weird because u never know the parents name
		 *  /parent::parentName    can be written since this is more readable
		 *  to jump to the grandparent by passing the parent: in that case use the ancestor tag
		 *  /ancestor::ancestorName
		 *  when we talk at the same level==> siblings
		 *  the previous sibling/siblings--is called preceding siblings
		 *  /preceding-sibling::siblingName
		 *  
		 *  the following sibling/siblings--r called following siblings
		 *  /following-sibling::siblingName
		 */
		
		//parent to direct child: /
		//form/div/input
		
		//parent to direct + indirect child: //
		//select[@id='Form_getForm_Country']//option
		//div[@id='content']//img
		
		//child to parent:
		//input[@id='input-email']/../../..
		//input[@id='input-email']parent::div/parent::form
		
		//input[@id='input-email']/ancestor::form
		//input[@id='input-email']/ancestor::form/ancestor::body/ancestor::html
		
		//a[text()='Recurring payments']/ancestor::aside
		
		//a[text()='Recurring payments']/preceding-sibling::a[text()='Downloads']
		//a[text()='Recurring payments']/following-sibling::a[text()='Returns']
		
		//input[@id='input-email'/preceding-sibling::label
		//label[text()='E-Mail Address']//following-sibling::input
		

	}

}
