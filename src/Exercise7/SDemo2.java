package Exercise7;

// Применение статического метода
class StaticMeth {
    static int val = 1024; // статическая переменная

    // Статический метод
    static int valDiv2(){
        return  val/2;
    }
}

 class SDemo2 {
    public static void main (String [] args){

        System.out.println("Знaчeниe val: " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " +
                StaticMeth.valDiv2());
        StaticMeth.val = 4;
        System.out.println("Знaчeниe val: " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " +
                StaticMeth.valDiv2());
    }

}

/*
На применение методов типа static накладывается ряд следующих ограничений:
1. в методе типа static допускается непосредственный вызов только других методов
типа static;
2. для метода типа static непосредственно доступными оказываются только друтие
данные типа static, определенные в его классе;
3.  в методе типа static должна отсутствовать ссылка this.
 */

/*
НЕ СРАБОТАЕТ

class StaticError {
int denom = 3; // обычная переменная экземпляра
static int val = 1024; // статическая переменная

/Ошибка! К нестатическим переменным нельзя обращаться
из статического метода.

static int valDivDenom() {
    return val/denom; // не пройдет компиляцию!
 */