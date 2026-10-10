class Student{
String name;
int age;
long mobile;

Student(String name,int age,long mobile){
this.name=name;
this.age=age;
this.mobile=mobile;
}

void display(){
System.out.println("Name: "+name);
System.out.println("Age: "+age);
System.out.println("Mobile: "+mobile);
}
}