public class MarksCondition {
    public static void main(String[] args){
        int marks = 87;

        if(marks>= 90){
            System.out.println("Marks:" + marks + "Grade A");
        }else if(marks>=80){
            System.out.println("Marks:" + marks + "Grade B");
        }else if(marks>=60){
            System.out.println("Marks:" + marks + "Grade C");
        }else if(marks>=45){
            System.out.println("Marks:" + marks + "Grade D");
        }else{
            System.out.println("Marks:" + marks + "Fail");
        }
    }
}
