package Arguments;

public class arguments2 {
    public static void totalMarks(int ... marks){
        int totalMarks = 0;
        for (int mark: marks){                                //method 1
            System.out.println(mark);
            totalMarks +=mark;

        }

        for(int i=0; i<marks.length; i++){                    //method 2
            totalMarks +=marks[i];

        }
        System.out.println("TotalMarks " +totalMarks);
    }

    public static void main(String[] args) {
        totalMarks(89, 67, 98);
    }

}
