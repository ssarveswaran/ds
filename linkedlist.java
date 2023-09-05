public class linkedlist {
    node head;
    public void insert(int a){
        node node=new node();
        node.data=a;
        node.next=null;
        if(head==null){
            head=node;
        }
        else{
            node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }
    public void insertAtStart(int a){
        node node=new node();
        node.data=a;
        node.next=null;
        node.next=head;
        head=node;}
      public void insertindexAt(int i,int a){
        node node=new node();
        node.data=a;
        node.next=null;
        node h=head;
        for(int j=0;j<i-1;j++){
            h=h.next;
        }
        node.next=h.next;
        h.next=node;
      }
        
    public void show(){
        node nl=head;
        while(nl.next!=null){
            System.out.println(nl.data);
            nl=nl.next;
        }
            System.out.println(nl.data);
        
    }

    
}
