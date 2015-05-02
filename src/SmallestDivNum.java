/*
 * Created by Alex Jerez on 3/19/15.
 */
public class SmallestDivNum {

    public static void main(String[] args) throws InterruptedException {

        int highest =  22897660;//2520;//2102411264;//2520;//88695660;
        boolean ding = false;
        int incr = 20;
        int lowest = 20;
        for (int q = highest;!ding;q += incr){
            //--->System.out.println("Stage: " + q);
            //number steps into trial
            for (int temp=20;temp>=1; temp--){
                //---->System.out.print(temp + "...");
                //System.out.println(": Increasing at " + incr + "...");
                if(q%temp==0 && temp<=19){
                    if (temp<lowest) {
                        lowest = temp;
                        highest = q;
                        //System.out.println("")
                        System.out.println("lowest is now " + lowest);
                        Thread.sleep(1000);
                    }
                    if(temp==1){
                        ding = true;
                        System.out.println("DING! We found a number! " + highest);
                        System.out.println("lowest: " + lowest);
                        System.out.println("q: " + q);
                        break;
                    }
                }
                else if (q%temp!=0){
                    //System.out.println("");
                    break;
                }
                //System.out.printf("Now Trying %d %n", incr);
            }
        }

    }
}
