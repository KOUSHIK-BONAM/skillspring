class Task{

    int id;
    String name;
    String status;

    Task next;

    Task(int id,String name,String status){

        this.id=id;
        this.name=name;
        this.status=status;
    }
}

public class TaskList{

    static Task head=null;

    static void add(int id,String name,String status){

        Task newNode=new Task(id,name,status);

        newNode.next=head;
        head=newNode;
    }

    static void search(int id){

        Task temp=head;

        while(temp!=null){

            if(temp.id==id){

                System.out.println(temp.name);
                return;
            }

            temp=temp.next;
        }

        System.out.println("Not Found");
    }

    static void traverse(){

        Task temp=head;

        while(temp!=null){

            System.out.println(temp.id+" "+temp.name);

            temp=temp.next;
        }
    }

    static void delete(int id){

        if(head.id==id){

            head=head.next;
            return;
        }

        Task temp=head;

        while(temp.next!=null){

            if(temp.next.id==id){

                temp.next=temp.next.next;
                return;
            }

            temp=temp.next;
        }
    }

    public static void main(String args[]){

        add(1,"Coding","Pending");
        add(2,"Testing","Done");

        traverse();

        search(1);

        delete(2);

        System.out.println("After Delete");

        traverse();
    }
}