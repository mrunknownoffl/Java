import java.util.*;
public class DoublyLinkListDemo {
    public static void main(String[] args) {
        int i,choice,ele,pos;
        LinkedList<Integer> dobList = new LinkedList<Integer>();
      System.out.println("1.Insert at begining");
      System.out.println("2.Insert at end");
      System.out.println("3.Insert at position");
      System.out.println("4.Enter element to delete");
      System.out.println("5.Exit");
     Scanner sc=new Scanner(System.in);
   do
    {
     System.out.println("enter your choice");
     choice=sc.nextInt();
     switch(choice)
      {
        case 1:System.out.println("enter element");
               ele=sc.nextInt();
               dobList.addFirst(ele);
               break;
        case 2:System.out.println("enter element");
               ele=sc.nextInt();
               dobList.addLast(ele);
               break;
        case 3:System.out.println("enter position");
               pos=sc.nextInt();
               if(pos<=dobList.size())
               {
               System.out.println("enter element");
               ele=sc.nextInt();
               dobList.add(pos,ele);
               }
               else
               {
               System.out.println("enter the size between 0to"+dobList.size());
               }
               break;
        case 4:System.out.println("enter element to be deleted");
               Integer rm;
               rm=sc.nextInt();
               if (dobList.contains(rm))
               {
               dobList.remove(rm);
               Iterator itr=dobList.iterator(); 
               System.out.println("Elements after deleting :"+rm);
               while(itr.hasNext())
                 {  
                    System.out.print(itr.next()+"<->"); 
                  }
                System.out.println("NULL"); 
                }
                else
                {
                 System.out.println("element not found");
                }
               break;
        
       case 5:System.out.println("program terminated");
              break;
       default:System.out.println("enter correct choice");
       }
    }
      while(choice!=5);
       }  
    }
