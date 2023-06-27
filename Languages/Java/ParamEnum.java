enum MyEnum {
    EN1, EN2(1), EN3(2, 3); // All the enum variable are static final constants by default, hence the static constants
    // here are called and their respective class initializers.
    // Enums can be declared private inside the class but not outside.
    // Multiple enums can be created inside the class
    // Enums can also be declared inside methods or blocks called local enums.
    // 
    static {System.out.print(0);}
    {System.out.print(4);}
    MyEnum() {System.out.print(5);}
    MyEnum(int a) {System.out.print(a);}
    MyEnum(int a, int b) {System.out.print(a+""+b);}
}
public class ParamEnum{
    public static void main(String args[]) {
        MyEnum m = MyEnum.EN1;
    }
}