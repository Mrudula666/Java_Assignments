/**
 * 
 */
package corejava.day3assignments;

/**
 * @author mrnimmal
 *
 */

public class Date {
	private int d,m,y;

	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date(int d, int m, int y) {
		super();
		this.d = d;
		this.m = m;
		this.y = y;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		
		String date = "";
		if((d<=30 || d == 31) && (m<=12))
			date = d+"/"+m+"/"+y;
		else
			date = "Invalid date";
		return date;
	}

	public static boolean isSmaller(Date date) {
		boolean flag = false;
		Date givenDate = new Date(6, 2, 1996);
		if(date.d<=givenDate.d || date.m<=givenDate.m || date.y<=givenDate.y);
		flag = true;
		return flag;
	}

	public static int[] diff(Date date) {
		Date givenDate = new Date(6,2,1996);
		int[] differenceOfDate = new int[3];
		if(date.d>=givenDate.d || date.m>=givenDate.m || date.y>=givenDate.y){
		differenceOfDate[0] = date.d - givenDate.d;
		differenceOfDate[1] = date.m - givenDate.m;
		differenceOfDate[2] = date.y - givenDate.y;
		}else
		{
			differenceOfDate[0] = givenDate.d - date.d;
			differenceOfDate[1] = givenDate.m - date.m;
			differenceOfDate[2] = givenDate.y - date.y;
			
		}
		return differenceOfDate;
	}

}
