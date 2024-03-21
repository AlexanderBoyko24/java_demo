package Lesson7;

public class StringBuilderStringBufferDemo {
    public static void main(String[] args) {

        int iterations = 100000;

        long startTimeNormal = System.currentTimeMillis();
        String resultNormal = "";
        for (int i = 0; i < iterations; i++) {
            resultNormal += "Iteration" + i + " ";
        }
        long endTimeNormal = System.currentTimeMillis();
        long durationNormal = endTimeNormal - startTimeNormal;
        //  System.out.println("Result string: " + resultNormal);
        System.out.println("Time taken withoutB/B" + durationNormal + "ms");
//-------------------------------------------------------------------------------


        long startTimeStringBuilder = System.currentTimeMillis();

        StringBuilder myStringBuilder = new StringBuilder();


        for (int i = 0; i < iterations; i++) {
            myStringBuilder.append("Iteration ").append(i).append(" ");
        }
        long endTimeStringBuilder = System.currentTimeMillis();
        long durationStringBuilder = endTimeStringBuilder - startTimeStringBuilder;
        // System.out.println("Result string: " + myStringBuilder);
        System.out.println("Time taken with StringBuilder " + durationStringBuilder + "ms");

//_____________________________________________________________________________________

        long startTimeStringBuffer = System.currentTimeMillis();

        StringBuffer myStringBuffer = new StringBuffer();


        for (int i = 0; i < iterations; i++) {
            myStringBuffer.append("Iteration ").append(i).append(" ");
        }
        long endTimeStringBuffer = System.currentTimeMillis();
        long durationStringBuffer = endTimeStringBuffer - startTimeStringBuffer;
        System.out.println("Time taken with StringBuffer  " + durationStringBuffer + "ms");


    }
}
