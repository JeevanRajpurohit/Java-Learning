public class DebuggingLearning {
    public static void main(String[] args) {
        System.out.println("Welcome");
        double ans = findAverage(args);
        System.out.println("finded average is : "+ ans);
    }
    public static double findAverage(String[] input){
        double avg= 0;
        for(String s : input){
            avg+=Integer.parseInt(s);
        }
        return avg;
    }
}
