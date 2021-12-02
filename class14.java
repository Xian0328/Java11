interface iVolume
{
	public void showData();//顯示球體的資料
	public double vol();//計算球體積
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
		System.out.println("球心:("+x+","+y+")");
		System.out.println("半徑:"+radius);
		System.out.println("球體積:"+vol());
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
		System.out.println("球心:("+x+","+y+")");
		System.out.println("半徑:"+radius);
		System.out.println("球體積:"+vol());
	}
}
public class class14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle1 cir=new CCircle1(8,6,2);
		cir.showData();
		//(a)//球心:(8,6)
		//半徑:2
		//球體積:33.49333333333333
		//(b)因為同樣都是抽象類別所以不必宣告
		CCircle2 cir1=new CCircle2(8,6,2);//(c)
		cir1.showData();
	}

}


