import java.util.HashMap;
import java.util.Map;

public class Main {

    public static  boolean isSumInArr( int[] arr, int inputSum ){

        Map< Integer, Integer > arrMap = new HashMap<>();

        createMap(arr, arrMap);

        for ( Integer key :  arrMap.keySet() ){
            int temp = inputSum - key;
            if( inputSum == key  ){
                    return false;
            }
            if( inputSum == key*2 && arrMap.get(key) ==1 ){
                return false;
            }
            if( arrMap.containsKey(temp) ){
                return true;
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
