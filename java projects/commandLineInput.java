import java.io.*;
import java.util.*;
class commandLineInput{
	public static void main(String args[])throws Exception{
	int a=Integer.parseInt(args[0]);
	float b=Float.parseFloat(args[1]);
	DataInputStream dis=new DataInputStream(System.in);
	System.out.println("hello world");
	int i;
	i=Integer.parseInt(dis.readLine());
	System.out.println(i);
	System.out.println(a);
	System.out.println(b);
	}
}


/*
		_O_U_T_P_T_

D:\java projects>java commandLineInput 23 43.567
hello world
21---input
21
23
43.567

*/