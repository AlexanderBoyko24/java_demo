package Chaper14.LambdaConstructorRef;

 class MyClass {
    private  String str;

     // Этот конструктор принимает аргумент
     MyClass (String s) { str = s; }

     // Это конструктор по умолчанию
     MyClass () { str = ""; }

     String getStr() {return str;}
}