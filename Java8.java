import java.util.List;

public class Java8
{		
	public boolean searchEle(List<Integer> a,int x)
       {
		//add code here
	     if(a.contains(x)){
	         return true;
	     } return false;
	}
	public boolean insertEle(List<Integer> a,int y,int yi)
        {
              //add code here.	
           a.add(yi,y);
            return true;
	}
	public boolean deleteEle(List<Integer> a,int z)
        {
		//add code here.
		if(a.contains(z)){
		    a.remove(a.indexOf(z));
		    return true;
		}
		return false;
	}
}
