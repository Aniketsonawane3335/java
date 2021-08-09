
// Object and object refferance




class Data
{

int i,j,k;

static int c;
void method1()
{
System.out.println("Instance method or not static");
}
static void method2()
{
System.out.println("non instance or static variable");
}
}
class Firstjava
{
public static void main(String args[])
{
Data d;
d=new Data();
Data.method2();

// Data.method1();

d.method1();

//new Data.method1();
}
}


