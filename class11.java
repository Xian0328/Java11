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
	protected String id;//�Ǹ�
	protected String name;//�m�W
	protected int mid;//�������Z
	protected int finl;//�������Z
	protected int common;//���ɦ��Z
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
		System.out.println("�Ǹ�:"+id);
		System.out.println("�m�W:"+id);
	}
	public void showScore()
	{
		System.out.println("�������Z:"+mid);
		System.out.println("�������Z:"+finl);
		System.out.println("���ɦ��Z:"+common);
	}
	public double calcu()
	{
		return mid*0.3+finl*0.3+common*0.4;
	}
	public void show()
	{
		this.showData();
		this.showScore();
		System.out.println("�Ǵ����Z:"+calcu());
	}
}
public class class11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CStu stu=new CStu("940001","Fiona",90,92,85);
		stu.show();
	}

}
