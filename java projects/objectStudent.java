import java.io.*;
import java.util.*;
class objectStudent{
	
	int roll;
	String name;
	
	public static void main(String args[])throws Exception{

		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("enter roll no:");
		int r=Integer.parseInt(dis.readLine());
		System.out.println("enter name");
		String s=dis.readLine();

		objectStudent s1=new objectStudent();
		s1.name=s;
		s1.roll=r;

		System.out.println("student name="+s1.name);
		System.out.println("student name="+s1.roll);
	}
}


/*
		_O_U_T_P_T_

D:\java projects>java objectStudent
enter roll no:
34
enter name
shiv
student name=shiv
student name=34

*/