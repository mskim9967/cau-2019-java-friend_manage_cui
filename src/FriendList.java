/**
 * Friend Ŭ������ ���ҷ� ������ �迭�� ǥ���ϴ� Ŭ����
 * 
 * @author 20186274����
 * 
 * 2019.04.05 ���� �ۼ� 
 * 2019.04.15 ���� ���� 
 */
public class FriendList {

	private static final int MAX_FRIEND = 100;

	private Friend[] listOfFriend;
	private int numOfFriend;

	/* Friend Ŭ������ MAX_FRIEND ��ŭ ������ �迭�� �����ϴ� ������ */ 
	public FriendList() {
		numOfFriend=0;
		listOfFriend = new Friend[MAX_FRIEND];
	}

	/**
	 * Friend�� �迭�� �߰��ϰ�  Friend ���� ������Ű�� �޼��� 
	 * @param friend	�߰��� ģ�� 
	 */
	public void addFriend(Friend friend) {
		listOfFriend[numOfFriend] = friend;
		numOfFriend++;
	}
	
	/**
	 * Friend�� ���� ��ȯ�ϴ� �޼���
	 * @return	ģ�� �� ��
	 */
	public int numFriends() {
		return numOfFriend;
	}
	
	/**
	 * �迭���� i��° Friend�� ��ȯ�ϴ� �޼���  
	 * @param i	i��°
	 * @return	i��° ģ�� 
	 */
	public Friend getFriend(int i) {
		return listOfFriend[i];
	}
} 