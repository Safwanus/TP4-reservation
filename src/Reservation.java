package reservation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reservation {

	private Date date;
	private double identifiant;
	private String etat="attente";
	private Vol v = new Vol();
	private List<Client> cli = new ArrayList<Client>();


	public Date getDate(){
		return date;}
	public double getIdentifiant(){
		return identifiant;}
	public String getEtat(){
		return etat;}
	public Vol getVol(){
		return v;}
	public List<Client> getCli(){
		return new ArrayList<Client>(cli);}


	private void setDate(Date date){
		this.date = date;}
	private void setIdentifiant(double identifiant){
		this.identifiant=identifiant;}
	private void setEtat(String etat){
		this.etat=etat;}
	private void setVol(Vol vol){
		this.v=vol;}



	private void addCli(Client unClient){
		this.cli.add(unClient);
	}
	private void rmCli(Client unClient){
		this.cli.remove(unClient);
	}



	public void annuler(){ 
		switch(etat){
			case "payer": this.rembourser(); etat="annuler"; break;
			default: etat="annuler"; 
			}
		 }
	public void confirmer(){ 
		switch(etat){
			case "payer": etat="confirmer"; break;
			default: throw new RuntimeException("Ne peut pas confirmer sauf si en etat payer");
			}
		}
	public void payer(){
		switch(etat){
			case "attente": etat="payer"; break;
			default: throw new RuntimeException("Ne peut pas payer une reservation payer, annuler ou confirmer");
			}
		}
	public void rembourser(){
		// remboursement
	}


}
