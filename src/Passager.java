package reservation;

import java.util.ArrayList;
import java.util.List;

public class Passager {

	private String nom;
	private String contact;
	private List<Reservation> res = new ArrayList<Reservation>();

	public String getNom(){
		return nom;}
	public String getContact(){
		return contact;}
	public List<Reservation> getRes(){
		return new ArrayList<Reservation>(res);}


	private void setNom(String nom){
		this.nom=nom;}
	private void setContact(String contact){
		this.contact=contact;}
	private void addRes(Reservation uneReservation){
		this.res.add(uneReservation);}
	private void rmRes(Reservation uneReservation){
		this.res.remove(uneReservation);}


}
