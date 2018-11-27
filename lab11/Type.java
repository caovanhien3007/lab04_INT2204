package lab11;

import java.util.ArrayList;

public class Type<T> {
	 private ArrayList<T> arr = new ArrayList<>();
	 public  boolean compera(T a,T b) {
		 String Sa=a.toString();
		 String Sb=b.toString();
		 if(Sa.compareTo(Sb)>0)return true;
		 else return false;
	 }
	 public void getarr(T New) {
		if(this.arr.size()==0)this.arr.add(New);
		else {
			for(int i=0;i<this.arr.size();i++)
			{
				if(this.compera(New, this.arr.get(i)))
				{
					this.arr.add(i, New);
					return;
				}
			}
			this.arr.add(New);
		}
	 }
	public void ToString () {
		for(int i=0;i<this.arr.size();i++)
		{
			System.out.print(this.arr.get(i)+" ");
		}
	}
}
