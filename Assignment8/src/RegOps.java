public class RegOps
{
	public static Course lookupCourseByName(Course[] catalog, String courseName)
	{
		for(int i = 0; i < catalog.length; i++){
			if (catalog[i].getName().equals(courseName)){
				return catalog[i];
			}
		}
		return null;// replace this line with your code




	}
	
	public static Course[] lookupCoursesByDept(Course[] catalog, int dept)
	{
		int count = 0;
		for(int i = 0; i < catalog.length; i++){
			if (catalog[i].getDepartment() == dept){
				count++;
			}
		}
		int j = 0;
		Course[] a = new Course[count];
		for(int i = 0; i < catalog.length; i++){
			if (catalog[i].getDepartment() == dept){
				a[j] = catalog[i];
				j++;
			}
		}
		if(count == 0){
			return null;
		}
		return a;
		 // replace this line with your code




	}
	
	public static void sortByNumber(Course[] catalog)
	{
		for(int i=0; i<catalog.length; i++){
	        for(int j=1; j<catalog.length; j++){
	            if(catalog[j].getDepartment() < catalog[j-1].getDepartment() ){
	                Course temp = catalog[j];
	                catalog[j] = catalog[j-1];
	                catalog[j-1] = temp;            
	            }
	        }
	     }
		
		for(int m = 0; m < catalog.length; m++){
			for(int k = 1; k < catalog.length; k++ ){
			 if(catalog[k].getDepartment() == catalog[k-1].getDepartment() ){
				 if(catalog[k].getCourseNumber() < catalog[k-1].getCourseNumber() ){
					 Course temp2 = catalog[k];
					 catalog[k] = catalog[k-1];
					 catalog[k-1] = temp2; 
				 }
			 }
			}
			
		}
		
		return; // replace this line with your code




	}
	public static void sortByTime(Course[] catalog)
	{
		int test = 0;
		int test2 = 0;
		System.out.println(catalog[1].getDay());
		for(int i=0; i<catalog.length; i++){
	        for(int j=1; j<catalog.length; j++){
	        	if(catalog[j].getDay() == 'M'){
	        		test = 0;
	        	}
	        	if(catalog[j].getDay() == 'T'){
	        		test = 1;
	        	}
				if(catalog[j].getDay() == 'W'){
					test = 2;        		
					        	}
				if(catalog[j].getDay() == 'H'){
					test = 3;
				}
				if(catalog[j].getDay() == 'F'){
					test = 4;
	        	}
	        	if(catalog[j].getDay() == 'S'){
	        		test = 5;
	        	}
	        	if(catalog[j-1].getDay() == 'M'){
	        		test2 = 0;
	        	}
	        	if(catalog[j-1].getDay() == 'T'){
	        		test2 = 1;
	        	}
				if(catalog[j-1].getDay() == 'W'){
					test2 = 2;  		
					        	}
				if(catalog[j-1].getDay() == 'H'){
					test2 = 3;
				}
				if(catalog[j-1].getDay() == 'F'){
					test2 = 4;
	        	}
	        	if(catalog[j-1].getDay() == 'S'){
	        		test2 = 5;
	        	}
	            if(test < test2 ){
	                Course temp = catalog[j];
	                catalog[j] = catalog[j-1];
	                catalog[j-1] = temp;            
	            }
	        }
	     }
		
		for(int m = 0; m < catalog.length; m++){
			for(int k = 1; k < catalog.length; k++ ){
			 if(catalog[k].getDay() == catalog[k-1].getDay() ){
				 if(catalog[k].getPeriod() < catalog[k-1].getPeriod() ){
					 Course temp2 = catalog[k];
					 catalog[k] = catalog[k-1];
					 catalog[k-1] = temp2; 
				 }
			 }
			}
			
		}
		return; // replace this line with your code




	}
	
	public static boolean addCourse(
		Course[] catalog,
		Course[] mySchedule,
		int myNumCourses,
		int dept,
		int courseNum)
	{
		int j = 0;
		if (mySchedule.length <= myNumCourses){
			System.out.println(mySchedule.length);
			return false;
		}
		for (int i = 0; i < catalog.length; i++){
		if(catalog[i].getDepartment() == dept && catalog[i].getCourseNumber() == courseNum){
			mySchedule[myNumCourses] = catalog[i];
			j++;
			}
		}
		if( j == 0){
			return false;
		}
		return true; // replace this line with your code




	}
	
	public static boolean dropCourse(
		Course[] mySchedule,
		int myNumCourses,
		int dept,
		int courseNum)
	{
		int j = 0;
		for(int i = 0; i < myNumCourses; i++){
		if(mySchedule[i].getDepartment() == dept && mySchedule[i].getCourseNumber() == courseNum){
			if(i < myNumCourses){
				for(j = i; j < myNumCourses; j++){
					mySchedule[i] = mySchedule[i+1];
					i++;
				}
			}
		}
		}
		if (j==0){
		return false;
		}
		return true; // replace this line with your code



	}

	public static int countCredits(Course[] mySchedule, int myNumCourses)
	{
		int credit = 0;
		for(int i = 0; i < myNumCourses; i++){
			credit = credit + mySchedule[i].getCredits();
			
		}
		return credit; // replace this line with your code




	}
}
