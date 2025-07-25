public class InvertedHalfPyramid180 {
    public static void main(String[] args) {
        int n=4;
        //outer loop
        for(int i=1;i<=n;i++){
            //outer loop(space print)
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
//inner loop(star print)
for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //new line after each row
            System.out.println();
        }
    }
}
