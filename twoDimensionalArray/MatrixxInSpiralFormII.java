package twoDimensionalArray;

public class MatrixxInSpiralFormII {

	public static void main(String[] args) {
		int n = 3;
		int[][] arr = new int[n][n];
        int minr = 0, minc = 0, maxr = n-1, maxc = n-1;
        int val = 1;
        while(minr <= maxr && minc <= maxc){
            for(int i=minc; i<=maxc; i++){
                arr[minr][i] = val++;
            }
            minr++;

            if(minr>maxr || minc>maxc){
                break;
            }
            for(int i=minr; i<=maxr; i++){
                arr[i][maxc] = val++;
            }
            maxc--;

            if(minr>maxr || minc>maxc){
                break;
            }
            for(int i=maxc; i>=minc; i--){
                arr[maxr][i] = val++;
            }
            maxr--;

            if(minr>maxr || minc>maxc){
                break;
            }
            for(int i=maxr; i>=minr; i--){
                arr[i][minc] = val++;
            }
            minc++;
        }
        
        for(int i=0; i<n; i++) {
        	for(int j=0; j<n; j++) {
        		System.out.print(arr[i][j]);
        	}
        }
	}

}
