import java.util.Scanner;

class A{
    static Scanner sc=new Scanner(System.in);
    
    static void input(int[][] arr){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("element for row "+i+" col "+j+" : ");
                arr[i][j]=sc.nextInt();
            }
        }
    }
    
    static void add(int[][] a,int[][] b,int[][] sum){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
    }
    
    static void display(int[][] arr){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] mat1=new int[3][3];
        int[][] mat2=new int[3][3];
        int[][] sum=new int[3][3];
        
        System.out.println("this is for 1st matrix");
        input(mat1);
        System.out.println("displaying 1st matrix:");
        display(mat1);
        
        System.out.println("this is for 2nd matrix");
        input(mat2);
        System.out.println("displaying 2nd matrix:");
        display(mat2);
        
        add(mat1,mat2,sum);
        
        System.out.println("matrix1 + matrix2 = answer matrix:");
        display(sum);
    }
}
