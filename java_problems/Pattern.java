public class Pattern {
    public static void main(String[] args) {
    //    for(int j=1;j<=5;j++){
	// 	for(int i=j;i>=1;i--)
	// 		System.out.print(i);
	// 			System.out.println();
	// 	}
        for(int i=1;i<=5;i++){
            for(int k=1;k<i;k++){
	            System.out.print(k);
            }
            for(int j=i;j>=1;j--){
	            System.out.print(j);
            }
            System.out.println();
        }
    }
}
