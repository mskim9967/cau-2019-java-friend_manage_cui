/**
 * Friend 클래스를 원소로 가지는 배열을 표현하는 클래스
 * 
 * @author 20186274김명승
 * 
 * 2019.04.05 최초 작성 
 * 2019.04.15 최종 수정 
 */
public class FriendList {

	private static final int MAX_FRIEND = 100;

	private Friend[] listOfFriend;
	private int numOfFriend;

	/* Friend 클래스를 MAX_FRIEND 만큼 가지는 배열을 생성하는 생성자 */ 
	public FriendList() {
		numOfFriend=0;
		listOfFriend = new Friend[MAX_FRIEND];
	}

	/**
	 * Friend를 배열에 추가하고  Friend 수를 증가시키는 메서드 
	 * @param friend	추가할 친구 
	 */
	public void addFriend(Friend friend) {
		listOfFriend[numOfFriend] = friend;
		numOfFriend++;
	}
	
	/**
	 * Friend의 수를 반환하는 메서드
	 * @return	친구 명 수
	 */
	public int numFriends() {
		return numOfFriend;
	}
	
	/**
	 * 배열안의 i번째 Friend를 반환하는 메서드  
	 * @param i	i번째
	 * @return	i번째 친구 
	 */
	public Friend getFriend(int i) {
		return listOfFriend[i];
	}
} 