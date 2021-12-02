interface iVolume
{
	public void showData();//��ܲy�骺���
	public double vol();//�p��y��n
}
abstract class CSphere implements iVolume
{
	final double PI=3.14;
	protected int x;
	protected int y;
}
class CCircle1 extends CSphere
{
	protected int radius;
	public CCircle1(int a,int b,int r)
	{
		x=a;
		y=b;
		radius=r;
	}
	public double vol()
	{
		return 4*PI*radius*radius*radius/3;
	}
	public void showData()
	{
		System.out.println("�y��:("+x+","+y+")");
		System.out.println("�b�|:"+radius);
		System.out.println("�y��n:"+vol());
	}
}
//(c)
abstract class CSphere1
{
	public abstract void showData();
	final double PI=3.14;
	protected int x;
	protected int y;
	public abstract double vol();
}
class CCircle2 extends CSphere
{
	protected int radius;
	public CCircle2(int a,int b,int r)
	{
		x=a;
		y=b;
		radius=r;
	}
	public double vol()
	{
		return 4*PI*radius*radius*radius/3;
	}
	public void showData()
	{
		System.out.println("�y��:("+x+","+y+")");
		System.out.println("�b�|:"+radius);
		System.out.println("�y��n:"+vol());
	}
}
public class class14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle1 cir=new CCircle1(8,6,2);
		cir.showData();
		//(a)//�y��:(8,6)
		//�b�|:2
		//�y��n:33.49333333333333
		//(b)�]���P�˳��O��H���O�ҥH�����ŧi
		CCircle2 cir1=new CCircle2(8,6,2);//(c)
		cir1.showData();
	}

}


