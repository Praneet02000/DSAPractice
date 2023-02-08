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

    public static int[] mergeSort(int[] a,int s,int e){

        if(s==e){
            int[] r=new int[1];
            r[0]=a[s];
            return r;
        }

        int mid=s+(e-s)/2;

        int[] l=mergeSort(a,s,mid);
        int[] r=mergeSort(a,mid+1,e);

        int[] f=merge(l,r);
        return f;

    }

    public static int[] merge(int[] a,int[] b){

        int i=0;
        int j=0;
        int n1=a.length;
        int n2=b.length;
        int[] res=new int[n1+n2];
        int k=0;
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                res[k]=a[i];
                i++;
                k++;
            }
            else{
                res[k]=b[j];
                j++;
                k++;
            }
        }

        while(i<n1){
            res[k]=a[i];
            i++;
            k++;
        }

        
        while(j<n2){
            res[k]=b[j];
            j++;
            k++;
        }
        return res;
    }
    
    public static void quickSort(int[] a,int s,int e ){

        if(s>=e)
            return;

        int p=partition(a,s,e);
        
        quickSort(a, s, p-1);
        quickSort(a,p+1,e);

    }

    public static int partition(int[] a,int s,int e){

        int p=s;
        int count=0;
        int i=s;
        
        while(i<a.length){
            if(a[i]<a[p]){
                count++;
            }
            i++;
        }
        p=s+count;
        int temp=a[p];
        a[p]=a[s];
        a[s]=temp;
        int p1=s;
        int p2=e;
        
        while(p1<p && p2>p){

            while(a[p1]<=a[p])
                p1++;

            while(a[p2]>a[p])
                p2--;

            if(p1<p && p2>p){
                temp=a[p1];
                a[p1]=a[p2];
                a[p2]=temp;
                p1++;
                p2--;
            }
        }

        return s+count;
    }

    public static void main(String[] args) {
        
        int[] a={23,3,1,45,20,5};
        int[] b={34,2,55,1,8};
        int[] c={4,20,5,1,18};
        int[] d={2,34,5,1,10};
        int[] e={89,34,2,56,6};
        selectionSort(a);
        bubbleSort(b);
        insertionSort(c);
        int[] result=mergeSort(d,0,4);
        quickSort(e,0,4);
        print(a);
        print(b);
        print(c);
        print(result);
        print(e);


    }
}