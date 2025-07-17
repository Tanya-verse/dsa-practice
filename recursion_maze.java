//count total paths in a maze to move from (0,0) to (n,m)

public class recursion_maze {
    public static int movecount(int i,int j,int n,int m){
        if(i==n||j==m){
            return 0;
        }
        if(i==n-1&&j==m-1){
            return 1;
        }

        //count downwards 
        int downcount=movecount(i+1, j, n, m);
        //count right
        int rightcount=movecount(i, j+1, n, m);
        return downcount+rightcount;
    }
    public static void main(String[] args) {
        int n=3,m=4;
        int total=movecount(0, 0, n, m);
        System.out.println("total moves : "+total);

    }
    
}


