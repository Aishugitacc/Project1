package org.phone;

public class PhoneInfo {
private void phoneName() {
	System.out.println("SAMSUNG GALAXY J7 PRO");

}
private void phoneMieiNum() {
   System.out.println("JDHFURHNJ877667");

}
private void camera() {
	System.out.println("5.8 PIXEL");

}
private void storage() {
 System.out.println("32 GB RAM");

}
private void osName() {
	System.out.println("ANDROID");

}

public static void main(String[] args) {
	PhoneInfo p = new PhoneInfo();
	p.phoneName();
	p.phoneMieiNum();
	p.camera();
	p.storage();
	p.osName();
}



}
