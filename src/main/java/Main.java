import java.util.HashMap;
import java.util.Map;

public class Main {

    public static  boolean isSumInArr( int[] arr, int num ){

        Map< Integer, Integer > arrMap = new HashMap<>();

        createMap(arr, arrMap);

        for ( Integer n :  arrMap.keySet() ){
            int temp = num - n;
            if( n==num  && arrMap.get(n) > 1  ){
                    return true;
            }else{
                if( arrMap.containsKey(temp) ){
                    return true;
                }
            }
        }
        return false;
    }

    private static void createMap(int[] arr, Map<Integer, Integer> arrMap) {
        for( int number : arr){
            int counter;
            if( arrMap.containsKey( number ) ){
                counter = arrMap.get(number);
                counter++;
                arrMap.put( number, counter );
            }else{
                arrMap.put( number, 1 );
            }
        }
    }

}
