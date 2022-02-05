package week1.day1;

public class Moblie {


		public void sendMsg(String message) {		
			System.out.println("Message sent:"+ message);
		}

		public void makeCall(String contact) {
			System.out.println("Calling " + contact + "....");
		}

		public void saveContact(long phoneNumber,String contactName) {
			System.out.println("Contact " + contactName + ":" + phoneNumber + " has been saved" );
		}

		public static void main(String[] args) {

			Moblie mobile1 = new Moblie();
			
			mobile1.saveContact(9578942211L,"Sunshine");
			mobile1.sendMsg("Good Day");
			mobile1.makeCall("Sunshine");
		}
}
