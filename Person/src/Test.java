
public class Test {
 public static void main(String[] args){

Person taro=new Person();
taro.name="山田太郎";
taro.age=20;
taro.phoneNumber="090-0000-1234";
taro.address="abcd@yahoo.ne.jp";

Person ziro=new Person();
ziro.name="木村次郎";
ziro.age=18;
ziro.phoneNumber="080-4567-1111";
ziro.address="ziro123@gmail.com";

Person hanako=new Person();
hanako.name="鈴木花子";
hanako.age=16;
hanako.phoneNumber="090-2222-3333";
hanako.address="hanahana@yahoo.ne.jp";

Person ryuhei=new Person();
ryuhei.name="西原龍兵";
ryuhei.age=22;
ryuhei.phoneNumber="090-7890-1234";
ryuhei.address="zxy@gmail.com";

Person aibo=new Person();
aibo.name="aibo";

Person asimo=new Person();
asimo.name="asimo";

Person pepper=new Person();

pepper.name="pepper";

System.out.println(taro.name);
System.out.println(taro.age);
System.out.println(taro.phoneNumber);
System.out.println(taro.address);
taro.talk();
taro.walk();
taro.run();

System.out.println(ziro.name);
System.out.println(ziro.age);
System.out.println(ziro.phoneNumber);
System.out.println(ziro.address);

System.out.println(hanako.name);
System.out.println(hanako.age);
System.out.println(hanako.phoneNumber);
System.out.println(hanako.address);

System.out.println(ryuhei.name);
System.out.println(ryuhei.age);
System.out.println(ryuhei.phoneNumber);
System.out.println(ryuhei.address);

aibo.talk();
aibo.walk();
aibo.run();

asimo.talk();
asimo.walk();
asimo.run();

pepper.talk();
pepper.walk();
pepper.run();
 }
}
