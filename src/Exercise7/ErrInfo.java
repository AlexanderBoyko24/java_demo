package Exercise7;

class Err1{
    String  msg; // сообщение об ошибке
    int severity; // уровень серьезности ошибки

    Err1(String m, int s) {
        msg = m;
        severity = s;
    }
}
class ErrorInfo {
    String msgs[] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"
    };
    int howbad[] = {3,3,2,4};

    Err1 getErrorInfo(int i) {
        if (i >=0 & i < msgs.length)
            return new Err1(msgs[i], howbad[i]);
        else
            return new Err1("Несуществующий код ошибки", 0);

    }
}


 class ErrInfo {
    public static void main (String [] args){
        ErrorInfo err = new ErrorInfo();
        Err1 e;

        e = err.getErrorInfo(2);
        System.out.println(e.msg + " level: " + e.severity);

        e = err.getErrorInfo(19);
        System.out.println(e.msg + " level: " + e.severity);
    }
}
