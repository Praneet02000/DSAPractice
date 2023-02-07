class Test{

    public static void bubbleSort(int[] a){

        int n=a.length;
        int swapped=0;

        for(int i=0;i<n-1;i++){
            swapped=0;
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swapped=1;
                }
            }
            if(swapped==0)
                break;
        }
    }

    public static void selectionSort(int[] a){
        int n=a.length;
        
        // int[] a={23,3,1,45,20,5};
        for(int i=0;i<n-1;i++){
            int minn=i;
            for(int j=i+1;j<n;j++){
                if(a[minn]>a[j])
                    minn=j;
            }
          
            int temp=a[minn];
            a[minn]=a[i];
            a[i]=temp;
           
        }

    }

    public static void insertionSort(int[] a){
        int n=a.length;

        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
                else
                    break;
            }
        }
    }
    public static void print(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int[] a={23,3,1,45,20,5};
        int[] b={34,2,55,1,8};
        int[] c={4,20,5,1,18};
        selectionSort(a);
        bubbleSort(b);
        insertionSort(c);
        print(a);
        print(b);
        print(c);


    }
}