/**
 * ģ���� ���� ������ ǥ���ϴ� Ŭ����
 * ���� ����:�̸�, �׷�, ��ȭ��ȣ, �̸����ּ�, ��������
 * 
 * @author 20186274����
 * 
 * 2019.04.05 ���� �ۼ� 
 * 2019.04.15 ���� ���� 
 */
public class Friend {

	private String name;
	private int group;
	private String phoneNumber;
	private String emailAddress;
	private String photo;

	public Friend() {
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	public String getName() {
		return name;
	}
	public int getGroup() {
		return group;	
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getPhoth() {
		return photo;
	}
	
	/**
	 * ģ���� ��� ������ ����ϴ� �޼��� 
	 */
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Group: " + group);
		System.out.println("Phone number: " + phoneNumber);
		System.out.println("Email address: " + emailAddress);
		System.out.println("Photo: " + photo);
	}

}
