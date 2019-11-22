class Date
{
	int mon[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
	int dd;
	int mm;
	int yy;
	Date (int d,int m,int y)
	{
		dd=d;
		mm=m;
		yy=y;
		if(y%400==0||y%4==0&&y%100!=0)
		mon[2]=29;
	}
	int noOfDays()
	{
		int days=dd;
		for(int i=1;i<mm;i++)
		days=days+mon[i];
		int y=yy-1;
		days=days+y*365;
		days=days+y/400+y/4-y/100;
		return days;
	}
	public static void main(String[] args)
	{
		Date d1=new Date(15,8,1947);
		Date d2=new Date(10,6,2019);
		System.out.println(d2.noOfDays()-d1.noOfDays());
	}
}