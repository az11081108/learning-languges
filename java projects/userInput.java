import java.io.*;
class userInput{
	public static void main(String args[])throws Exception{
	
	DataInputStream dis=new DataInputStream(System.in);
	System.out.println("hello world");
	int i;
	i=Integer.parseInt(dis.readLine());
	System.out.println(i);
	
	}
}