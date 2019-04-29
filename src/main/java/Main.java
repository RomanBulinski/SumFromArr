import java.util.HashMap;
import java.util.Map;

public class Main {

    public static  boolean isSumInArr( int[] arr, int num ){

        Map< Integer, Integer > arrMap = new HashMap<>();

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

        for ( Integer n :  arrMap.keySet() ){
            int temp = num - n;
            if( arrMap.containsKey(temp) && arrMap.get(temp) > 1 ){
                return true;
            }
        }
        return false;
    }

}
