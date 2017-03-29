import java.util.LinkedList;

class Datahold{
	public int a;
	public Datahold nextNode;
	public Datahold(int x){
		a = x;
	}
}

class DataList{
	public Datahold first;
	public DataList(){
		first = null;
	}
	public void add(int a){
		Datahold temp = new Datahold(a);
		temp.nextNode = null;
		if(first == null){
			first = temp;
			return;
		}
		Datahold last = first;
		while(last.nextNode != null)
			last = last.nextNode;
		last.nextNode = temp;
	}
	public void delete(){
		if(first ==  null){
			System.out.println("Link list empty");
			return;
		}
		if(first.nextNode == null){
			first = null;
			return;
		}
		Datahold beforeLast = null, last = first;
		while(last.nextNode != null){
			beforeLast = last;
			last = last.nextNode;
		}
		beforeLast.nextNode = null;
	}
	public void printList(){
		if(first == null){
			System.out.println("Link list empty");
			return;
		}
		Datahold temp = first;
		while(temp != null){
			System.out.print(temp.a + " ");
			temp = temp.nextNode;
		}
		System.out.println();
	}
}

public class Data_link_list {
	public static void main(String[] arg){
		DataList mylist = new DataList();
		mylist.add(1);
		mylist.add(2);
		mylist.add(3);
		mylist.printList();
		mylist.delete();
		mylist.printList();
		mylist.delete();
		mylist.printList();
		mylist.delete();
		mylist.printList();
	}
}