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
        node.data=data;
        node.next=null;
        node.next=head;
        head=node;}
        
    public void show(){
        node nl=head;
        while(nl.next!=null){
            System.out.println(nl.data);
            nl=nl.next;
        }
            System.out.println(nl.data);
        
    }
    
}
