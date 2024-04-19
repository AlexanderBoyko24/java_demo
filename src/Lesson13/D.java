package Lesson13;

public interface D {
    int getUserId();
    default int getAdminId(){
        return 1;
    }

    static int getUniversalID(){ return 0;}
}
