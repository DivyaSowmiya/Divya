class Prime
{
public static void main(String[] args)
{
int i=0;
int num=0;
String primeNumber="";
for(int i=1;i<100;i++)
{
int count=0;
for(num=i;num>=1;num--)
{
if(i%num==0)
{
count=count+1;
}
}
if(count==2)
{
primeNumber=primeNumber+i+"";
}
}
system.out.println(primeNumber);
}
}
