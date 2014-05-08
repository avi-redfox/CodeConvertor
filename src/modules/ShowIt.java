package modules;

import java.util.ArrayList;

public class ShowIt {
	public void show(ArrayList<String> a)
	{
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
	}
	public void show(int a)
	{
		System.out.println(a);
	}
	public void show(String a)
	{
		System.out.println(a);
	}
}
