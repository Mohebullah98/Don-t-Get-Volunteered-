import java.util.*;
public class Main {
   
  public static int[] solution(int data[],int n){
    int trueLength =data.length;
        HashMap<Integer,Integer> values = new HashMap<Integer,Integer>();
        for(int i=0;i<data.length;i++){
            if(values.containsKey(data[i])){
               int count = values.get(data[i]);
               values.put(data[i],count+1);
            }
          
          else  values.put(data[i],1);
        }
        for(int i=0;i<data.length;i++){
            if(values.get(data[i])>n){
                trueLength -=1;
                data[i]=-1;
            }
        }
       int result[] = new int[trueLength];
       int index=0;
       for(int i=0;i<data.length;i++){
         if(data[i]==-1) continue;
         result[index]=data[i];
         index+=1;
       }
    return result;
    }
    public static void main(String[] args) {
        // Your code here
        int data[]=new int[]{1,2,2,3,3,4,5,5};
        int result[] = solution(data,1);
       int data2[]=new int[]{1,2,2,3,3,4,5,5,5};
      //int res2[] = solution(data2,2);
        System.out.println(Arrays.toString(result));
      //System.out.println(Arrays.toString(res2));
      }
}
