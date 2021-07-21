package com.ust.examples;
enum WhoisRIR{
	ARIN("whois.arin.net"),
	RIPE("whois.ripe.net"),
	APNIC("whois.apnic.net"),
	AFRINIC("whois.afrinic.net"),
	LACNIC("whois.lacnic.net"),
	JPNIC("whois.jpnic.net"),
	KRNIC("whois.krnic.net"),
	CNNIC("whois.cnnic.net"),
	UNKNOWN("");

private String url;
WhoisRIR(String url){
	this.url= url;
}
 public String url(){
	 return url;
} 
}
public class EnumP5 {
public static void main(String[] args) {

System.out.println(WhoisRIR.ARIN.url());
}
}
