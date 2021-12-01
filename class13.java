interface Show_ans
{
	public void show();
}
interface Math3 extends Show_ans
{
	public void add(int a,int b);
	public void sub(int a,int b);
	public void mul(int a,int b);
	public void div(int a,int b);
}
class Compute3 implements Math3
{
	public int ans;
	public void add(int a,int b)//'a+b'
	{
		ans=a+b;
	}
	public void sub(int a,int b)//'a-b'
	{
		ans=a-b;
	}
	public void mul(int a,int b)//'a*b'
	{
		ans=a*b;
	}
	public void div(int a,int b)//'a/b'
	{
		ans=a/b;
	}
	public void show()
	{
		System.out.println("ans="+ans);
	}
}
public class class13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compute3 cmp=new Compute3();
		cmp.mul(3, 5);//'3*5'
		cmp.show();//'ans=15'
	}

}
