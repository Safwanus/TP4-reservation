package reservation;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private String nom,paiement,contact,reference;
	private List<Reservation> res = new ArrayList<Reservation>();
	
	public String getNom(){
		return nom  ;
	}
	public String getPaiement(){
		return paiement ;
	}
	public String getContact(){
		return contact ;
	}
	public String getNomReference(){
		return reference ;
	}

	public List<Reservation> getRes(){
		return new ArrayList<Reservation>(res);}
	

	private void setNom(String nom){
		this.nom = nom;
	}
	private void setPaiement(String p){
		this.paiement = p;
	}
	private void setContact(String c){
		this.contact = c;
	}
	private void setNomReference(String r){
		this.reference = r;
	}


	private void addRes(Reservation uneReservation){
		this.res.add(uneReservation);}
	private void rmRes(Reservation uneReservation){
		this.res.remove(uneReservation);}
	


}
