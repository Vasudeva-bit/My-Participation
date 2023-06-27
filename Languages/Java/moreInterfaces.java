interface Computer {
void work();
}
class Laptop implements Computer{
public void work() {}
}
class DesktopPC implements Computer{
public void work() {}
}
class Developer {
void devCode(Computer l) {
System.out.println("Writing a code");
}
}
class Main {
public static void main(String[] args) {
Computer lp = new Laptop();
Computer dp = new DesktopPC();
Developer d = new Developer();
d.devCode(lp);
Developer d2 = new Developer();
d.devCode(dp);
}
}