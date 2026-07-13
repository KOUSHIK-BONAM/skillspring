class Book{

    int id;
    String title;
    String author;

    Book(int id,String title,String author){

        this.id=id;
        this.title=title;
        this.author=author;
    }
}

public class LibrarySearch{

    static int linearSearch(Book arr[],String key){

        for(int i=0;i<arr.length;i++)
            if(arr[i].title.equals(key))
                return i;

        return -1;
    }

    static int binarySearch(Book arr[],String key){

        int low=0,high=arr.length-1;

        while(low<=high){

            int mid=(low+high)/2;

            int cmp=arr[mid].title.compareTo(key);

            if(cmp==0)
                return mid;

            if(cmp<0)
                low=mid+1;
            else
                high=mid-1;
        }

        return -1;
    }

    public static void main(String args[]){

        Book books[]={
            new Book(1,"C Programming","Dennis"),
            new Book(2,"Data Structures","Mark"),
            new Book(3,"Java","James")
        };

        int index=linearSearch(books,"Java");

        if(index!=-1)
            System.out.println("Book Found");
        else
            System.out.println("Book Not Found");
    }
}