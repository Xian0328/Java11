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
}
public class class11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
