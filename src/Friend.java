/**
 * 친구에 관한 정보를 표현하는 클래스
 * 정보 종류:이름, 그룹, 전화번호, 이메일주소, 사진파일
 * 
 * @author 20186274김명승
 * 
 * 2019.04.05 최초 작성 
 * 2019.04.15 최종 수정 
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
	 * 친구의 모든 정보를 출력하는 메서드 
	 */
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Group: " + group);
		System.out.println("Phone number: " + phoneNumber);
		System.out.println("Email address: " + emailAddress);
		System.out.println("Photo: " + photo);
	}

}
