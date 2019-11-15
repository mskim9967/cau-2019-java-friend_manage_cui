import java.io.File;
import java.util.Scanner;

public class TestFriend {

	int ll=5;
	
	public static void main(String[] args) {
/*
		FriendListFile friendListFile = new FriendListFile();
		FriendList friendList = new FriendList();

		friendList = friendListFile.readFileToList("friendlist-norm.data");

		for (int i = 0; i < friendList.numFriends(); i++) {
			friendList.getFriend(i).print();
		}

		System.out.println("Num of friend: " + friendList.numFriends());
*/
		
		TestFriend a=new TestFriend();

		int k=a.ll;
		String s=new String("abcde");
		String ss="f";
		ss=s.substring(1,5);
		System.out.println(ss);
		
		File file= new File("a.txt");
		Scanner input= new Scanner(System.in);
		
		s=input.next();
		
		System.out.println(s);
		
;		char z=(char)('a'+(int)(Math.random()*('z'-'a'+1)));

	}


}
