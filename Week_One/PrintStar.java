public class PrintStar {
    public static void main(String args[]){
        int row=3;
        int col=3;
        int num=0;
        for(int i=0;i<3; i++){
            for(int j=0; j<3; j++){
                num++;
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
