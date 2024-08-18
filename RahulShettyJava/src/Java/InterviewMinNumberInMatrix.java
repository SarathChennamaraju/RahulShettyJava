package Java;

public class InterviewMinNumberInMatrix {

	public static void main(String[] args) {
		int abc[][] = {{2, 4, 5}, {3, 2, 10}, {1, 2, 8}};
	//	int xyz[][] = {{3, 4, 5}, {3, 2, 10}, {1, 2, 0}};
        int min = abc[0][0];
        int mincolumn = 0; 

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (abc[i][j] < min) {
                    min = abc[i][j];
                    mincolumn = j;
                }
            }
        }
        System.out.println(min);
        int max=abc[0][mincolumn];
        
        for(int k=0;k<3;k++)
        {
        if(abc[k][mincolumn]>max)
        {
        max=abc[k][mincolumn];
        }   
        }
        System.out.println(max);
        }
    }
