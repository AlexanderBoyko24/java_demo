package Lesson7;

public class Student {
    String name;

    int[] grades;


    public Student(String name, int gradesnumber) {
        this.name = name;
        if (gradesnumber > 0) grades = new int[gradesnumber];
        else grades = new int[1];
    }

    public void addgrade(int index, int grade) {
        if (index >= 0 && index < grades.length)
            grades[index] = grade;
        else System.out.println("Warning! UnAcceptible index");
    }

    float avgCalc() {
        int sum = 0;
        int gradeqwt = 0;
        float avg;
        for (int x : grades) {
            if (x > 0) gradeqwt++;
            sum += x;
        }
        avg = (float) sum / gradeqwt;
        return avg;
    }


    int maxGrade() {
        int max;

        max = grades[0];

        for (int i = 1; grades.length > 1 && i < grades.length; i++) {

            if (grades[i] > max) max = grades[i];
        }
        return max;
    }
}
