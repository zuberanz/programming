package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ZigZag {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<List<Integer>> test = new ArrayList<List<Integer>>();
        test.add(new ArrayList<Integer>(Arrays.asList(1, 3, 4, 10, 11)));
        test.add(new ArrayList<Integer>(Arrays.asList(2, 5, 9, 12, 19)));
        test.add(new ArrayList<Integer>(Arrays.asList(6, 8, 13, 18, 20)));
        test.add(new ArrayList<Integer>(Arrays.asList(7, 14, 17, 21, 24)));
        test.add(new ArrayList<Integer>(Arrays.asList(15, 16, 22, 23, 25)));
        System.out.println(zigzagTraverse(test));
    }
    public static List<Integer> zigzagTraverse(List<List<Integer>> array) {
        // Write your code here.
        int height = array.size() - 1;
        int width = array.get(0).size() - 1;
        List<Integer> resultList = new ArrayList<Integer>();
        int row = 0;
        int col = 0;
        boolean goDown = true;
        while(!isOutOfBound(row, col, height, width )){
            resultList.add(array.get(row).get(col));
            if(goDown){
                if(col == 0 || row == height){
                    goDown = false;
                    if(row == height){
                        col ++ ;
                    }else {
                        row++;
                    }
                }else{
                    row++;
                    col--;
                }
            }
            else{
                if(row == 0 || col == width){
                    goDown = true;
                    if(col == width){
                        row ++;
                    }else{
                        col ++;
                    }
                }else{
                    row --;
                    col ++;
                }
            }
        }
        return resultList;
    }
    public static boolean isOutOfBound(int row, int col , int height ,int  width){
        return row < 0 || col < 0 || row > height || col > width;
    }
}