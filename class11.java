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
	public void showScore()
	{
		System.out.println("期中成績:"+mid);
		System.out.println("期末成績:"+finl);
		System.out.println("平時成績:"+common);
	}
	public double calcu()
	{
		return mid*0.3+finl*0.3+common*0.4;
	}
	public void show()
	{
		this.showData();
		this.showScore();
		System.out.println("學期成績:"+calcu());
	}
}
public class class11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CStu stu=new CStu("940001","Fiona",90,92,85);
		stu.show();
	}

}
