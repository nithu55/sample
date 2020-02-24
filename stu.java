import java.util.Scanner;
class stud
{
int m1,m2,m3,total,regno;
float avg;
String result;
void get()
{
Scanner a=new Scanner(System.in);
System.out.println("enter the m1:");
m1=a.nextInt();
System.out.println("enter the m2:");
m2=a.nextInt();
System.out.println("enter the m3:");
m3=a.nextInt();
}
void gettotal()
{
total=m1+m2+m3;
avg=total/3;
System.out.println("total:"+total);
System.out.println("average:"+avg);
}
void getresult()
{
if(m1>40&&m2>40&&m3>40)
{
System.out.println("pass");
}
else
{
System.out.println("fail");
}
}
}
class stu
{
public static void main(String arg[])
{
String name;
int regno;
Scanner s=new Scanner(System.in);
System.out.println("enter the name:");
name=s.nextLine();
System.out.println("enter the rollno:");
regno=s.nextInt();
stud obj=new stud();
obj.get();
obj.gettotal();
obj.getresult();
}
}
