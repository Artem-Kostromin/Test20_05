import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Num6_2_Courses {
    public static void main(String[] args) {
        int numOfCourses = 0;
        List<int[]> courses = new ArrayList<>();
        while(numOfCourses<11){
            int start = (int) (Math.random()*365);
            int end = (int) (Math.random()*365);
            if(end>start){
                int[] newCourse = {start,end};
                courses.add(newCourse);
                numOfCourses++;
            }
        }
        for(int[] i:courses){
            System.out.println(Arrays.toString(i));
        }
        System.out.println(maxScoreOfCourses(courses));
    }
    public static int maxScoreOfCourses(List listOfCourses){
        int len = listOfCourses.size();
        int count = 1;
        outer:
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++) {
                int startOfFirst = ((int[]) listOfCourses.get(i))[0];
                int finishOfFirst = ((int[]) listOfCourses.get(i))[1];
                int startOfSecond = ((int[]) listOfCourses.get(j))[0];
                int finishOfSecond = ((int[]) listOfCourses.get(j))[1];

                if (startOfFirst>finishOfSecond || finishOfFirst<startOfSecond){
                    count++;
                    continue outer;
                }

            }
        }
        return count;
    }

}
