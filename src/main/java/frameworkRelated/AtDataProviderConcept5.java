package frameworkRelated;

public class AtDataProviderConcept5 {

	public static void main(String[] args) {
		/*
		 * DataDrivenFrameWork: ==>driving/taking the data into test cases, from some external
		 * source is called Data driven framework
		 * that source could be an excel file OR directly hardCode data can be provided here
		 * 
		 * also called parameterization of test cases:
		 * thru xml file we supply configuration data like url or browserName etc
		 * BUT test data should not be supplied from the xml--in that case we will provide some
		 * data providers
		 * can provide n no. of data Providers --there is no limit
		 * 
		 * i) ==> create a meaningful name to the method in the testng classs which provides test
		 * data -- this method will return 2 dim object array ==>
		 * ii)this method should then be annotated with Data provider,==>write @DataProvider above the method
		 *  this method will return 2 dim object array 
		 * iii) in the actual test case ==> @Test mention the name of the dataProvider in double quotes
		 * 
		 * @DataProvider
		 * public void getProductCountData(){
		 * return new Object[][]{
		 * {"macbook",3},
		 * {"imac",1},
		 * {"samsung",2}
		 *   }
		 * }
		 * @Test(dataProvider="getProductCountData")
		 * public void searchResultsCountTest(String searchKey, int count){
		 * searchResultsPage = acctPage.doSearch("macbook");
		 * Assert.assertEquals(searchResultsPage.getSearchProductCount(),3);
		 * }
		 * 
		 * 
		 * when to use Data Provider??
		 * whenever we have to fetch/supply the data
		 */

	}

}
