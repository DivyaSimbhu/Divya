package week2.day2;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] m = {3,2,11,4,6,7};
		int[] n = {1,2,8,4,9,7};
				int length=m.length;
		int length2=n.length;
		
	for(int i=0; i<= length-1; i++)
	{
		for(int j=0; j<= length2-1; j++)
		{
			if(m[i]==n[j])
			{
				System.out.println(m[i]);
			}
		}
	}
	}	
	}
	
