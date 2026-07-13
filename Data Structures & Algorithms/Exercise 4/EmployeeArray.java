//Employee Management System

class Employee{

    int id;
    String name;
    String position;
    double salary;

    Employee(int id,String name,String pos,double sal){

        this.id=id;
        this.name=name;
        this.position=pos;
        this.salary=sal;
    }
}

public class EmployeeArray{

    static Employee emp[]=new Employee[10];
    static int count=0;

    static void add(Employee e){

        emp[count++]=e;
    }

    static void search(int id){

        for(int i=0;i<count;i++){

            if(emp[i].id==id){

                System.out.println(emp[i].name);
                return;
            }
        }

        System.out.println("Not Found");
    }

    static void traverse(){

        for(int i=0;i<count;i++)
            System.out.println(emp[i].id+" "+emp[i].name);
    }

    static void delete(int id){

        for(int i=0;i<count;i++){

            if(emp[i].id==id){

                for(int j=i;j<count-1;j++)
                    emp[j]=emp[j+1];

                count--;
                break;
            }
        }
    }

    public static void main(String args[]){

        add(new Employee(1,"Ram","Manager",50000));
        add(new Employee(2,"Anu","HR",40000));

        traverse();

        search(2);

        delete(1);

        System.out.println("After Deletion");

        traverse();
    }
}