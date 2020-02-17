package string.manipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class work_rough {

    // Computes sum all sub-array
    public static long SubArraySum(int arr[], int n)
    {
        long result = 0,temp=0;

        // Pick starting point
        for (int i = 0; i < n; i ++)
        {
            // Pick ending point
            temp=0;
            for (int j = i; j < n; j ++)
            {
                // sum subarray between current
                // starting and ending points
                temp+=arr[j];
                result += temp ;
            }
        }
        return result ;
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        String inputString = "Hi Amod. Your registration number is AX1234 and hallticket number is XC876";
        Pattern p = Pattern.compile("[A-Z]{2}\\d+");
        Matcher m = p.matcher(inputString);
        String [] values = new String[2];
        int i=0;
        Map<String,String> map = new HashMap<>();
        while (m.find()) {
            values[i++] = m.group();
        }
        if(inputString.indexOf("registration")<inputString.indexOf("hallticket")){
            map.put("registration", values[0]);
            map.put("hallticket", values[1]);
        }
        else{
            map.put("registration", values[1]);
            map.put("hallticket", values[0]);
        }
        for(Map.Entry e: map.entrySet()){
            System.out.println(e.getKey() +" : "+e.getValue());
        }
    }
}