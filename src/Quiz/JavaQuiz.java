package Quiz;

import javax.swing.JOptionPane;

public class JavaQuiz {

    static int points = 0;
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to Quiz.");
        
        // call the quiz method
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();
     
        result();
    }


    public static void question1() {
        String answer = JOptionPane.showInputDialog(null, "Question 1 of 10:\n" +
                "What is a correct syntax to output \"Hello World\" in Java?\n" +
                "A. echo(\"Hello World\")\n" +
                "B. Console.WriteLine(\"Hello World\")\n" +
                "C. System.out.println(\"Hello World\")\n" +
                "D. print(\"Hello World\")");
        switch (answer){
            case "C", "c" -> points+= 5;
        }
    }


    public static void question2() {
        String answer =  JOptionPane.showInputDialog(null, "Question 2 of 10:\n" +
                "Java is short for \"Javascript\".\n" +
                "A. true\n" +
                "B. false\n" +
                "C. All of the above.\n" +
                "D. None of the above.");
        switch (answer){
            case "B", "b" -> points+=5;
        }
    }


    public static void question3() {
        String answer =  JOptionPane.showInputDialog(null, "Question 3 of 10:\n" +
                "How do you insert COMMENTS in Java code?\n" +
                "A. # This is a comment.\n" +
                "B. // This is a comment.\n" +
                "C. /* This is a comment\n" +
                "D. All of the above.");
        switch (answer){
            case "B", "b" -> points+=5;
        }
    }


    public static void question4() {
        String answer =  JOptionPane.showInputDialog(null, "Question 4 of 10:\n" +
                "Which data type is used to create a variable that should store text?\n" +
                "A. String\n" +
                "B. myString\n" +
                "C. string\n" +
                "D. Txt");
        switch (answer){
            case "A", "a" -> points+=5;
        }
    }


    public static void question5() {
        String answer =  JOptionPane.showInputDialog(null, "Question 5 of 10:\n" +
                "How do you create a variable with the numeric value 5?\n" +
                "A. num x = 5\n" +
                "B. x = 5;\n" +
                "C. float x = 5;\n" +
                "D. int x = 5;");
        switch (answer){
            case "D", "d" -> points+=5;
        }
    }


    public static void question6() {
        String answer =  JOptionPane.showInputDialog(null, "Question 6 of 10:\n" +
                "How do you create a variable with the floating number 2.8?\n" +
                "A. byte x = 2.8f\n" +
                "B. float x = 2.8f;\n" +
                "C. int x = 2.8f;\n" +
                "D. x = 2.8f;");
        switch (answer){
            case "B", "b" -> points+=5;
        }
    }


    public static void question7() {
        String answer = JOptionPane.showInputDialog(null, "Question 7 of 10:\n" +
                "Which method can be used to find the length of a string?\n" +
                "A. getSize()\n" +
                "B. length()\n" +
                "C. getLength()\n" +
                "D. len()");
        switch (answer){
            case "B", "b" -> points+=5;
        }
    }


    public static void question8() {
        String answer = JOptionPane.showInputDialog(null, "Question 8 of 10:\n" +
                "Which operator is used to add together two values?\n" +
                "A. The & sign\n" +
                "B. The * sign\n" +
                "C. The + sign\n" +
                "D. The / sign");
        switch (answer){
            case "C", "c" -> points+=5;
        }
    }


    public static void question9() {
        String answer = JOptionPane.showInputDialog(null, "Question 9 of 10:\n" +
                "The value of a string variable can be surrounded by single quotes.\n" +
                "A. True\n" +
                "B. False\n" +
                "C. All of the above.\n" +
                "D. None of the above.");
        switch (answer){
            case "B", "b" -> points+=5;
        }
    }


    public static void question10() {
        String answer = JOptionPane.showInputDialog(null, "Question 10 of 10:\n" +
                "Which method can be used to return a string in upper case letters?\n" +
                "A. tuc()\n" +
                "B. toUpperCase()\n" +
                "C. toupperCase()\n" +
                "D. touppercase()");
        switch (answer){
            case "B", "b" -> points+=5;
        }
    }





    public static void result() {
        String name = JOptionPane.showInputDialog(null,"You finished the quiz.\nPlease enter your name?");
        if (points == 50)
        {
            JOptionPane.showMessageDialog(null, "Name: " + name + "\nTotal Score: " + points + "\nGood job!");
        }else if(points >= 30) {
            JOptionPane.showMessageDialog(null, "Name: " + name + "\nTotal Score: " + points + "\nYou Passed the quiz.");
        }else{
            JOptionPane.showMessageDialog(null, "Name: " + name + "\nTotal Score: " + points + "\nYou can still study more for the next quiz.");
        }
    }

}