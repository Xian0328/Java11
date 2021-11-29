interface Data
{
	public void showData();
}
interface Test
{
	public void showScore();
	public double calcu();
}
class CStu implements Data,Test
{
	protected String id;//學號
	protected String name;//姓名
	protected int mid;//期中成績
	protected int finl;//期末成績
	protected int common;//平時成績
	public CStu(String str1,String str2,int m,int f,int c)
	{
		id=str1;
		name=str2;
		mid=m;
		finl=f;
		common=c;
	}
	public void showData()
	{
		System.out.println("學號:"+id);
		System.out.println("姓名:"+id);
		
	}
}
public class class11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
