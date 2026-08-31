public class Arrays1 {
    public static void main (String []args){
        int[] scores ={55,78,92,60,88};
        for(int i=0; i< scores.length; i++){
            System.out.println(scores[i]);
        }
        int results=0;
        for(int i=0;i<scores.length;i++){
            results +=scores[i];
        }
        System.out.println(results);
        double average =0;
        for(int i=0; i<scores.length;i++){
            average +=scores[i];
        }
        System.out.println((double)average/scores.length);

        int max=scores[0];
        for(int i:scores){
            if(max<i){
                max=i;
            }
        }
        System.out.println(max);
    }
    
}
