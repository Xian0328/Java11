interface Data1
{
	public void best();//�P�_���@�즨�Z����
	public void failed();//�P�_���@�즨�Z�C��60��
}
interface Test1 extends Data1
{
	public void showData();//��ܾǥͪ���ƤΥ������Z
	public double average();//�p��ƾǩM�^�媺�������Z
}
class CStu1 implements Test1
{
	protected String name;
	protected int math;
	protected int english;
	public CStu1(String str,int m,int e)
	{
		name=str;
		math=m;
		english=e;
	}
	public void best()
	{
		if(math>english)
		{
			System.out.println(name+"���ƾǤ�^��n");
		}
		else if(english>math)
		{
			System.out.println(name+"���^���ƾǦn");
		}
	}
	public void failed()
	{
		if(math<60 & english>=60)
		{
			System.out.println(name+"���ƾǷ��F");
		}
		else if(math>=60 & english<60)
		{
			System.out.println(name+"���^����F");
		}
		else if(math<60 & english<60)
		{
			System.out.println(name+"���ƾǩM�^����F");
		}
	}
	public double average()
	{
		return (math+english)/2.0;
	}
	public void showData()
	{
		System.out.println("�m�W:"+name);
		System.out.println("�ƾǦ��Z:"+math);
		System.out.println("�^�妨�Z:"+english);
		System.out.println("�������Z:"+average());
	}
	public void show()
	{
		this.showData();
		this.best();
		this.failed();
	}
}
public class class12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CStu1 stu=new CStu1("Judy",58,91);
		stu.show();
	}

}
