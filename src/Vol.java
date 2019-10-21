package reservation;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class Vol {

	private String identifiant;
	private ZonedDateTime depart;
	private ZonedDateTime arrivee;
	private List<Passager> passager = new ArrayList<Passager>();
	private boolean isOpen = true;

	
	public String getIdentifiant(){
		return identifiant;}
	public ZonedDateTime getDepart(){
		return depart;}
	public ZonedDateTime getArrivee(){
		return arrivee;}
	public List<Passager> getCli(){
		return new ArrayList<Passager>(passager);}
	public boolean getIsOpen(){
		return isOpen;}


	private void setIdentifiant(String identifiant){
		this.identifiant=identifiant;}
	private void setDepart(ZonedDateTime depart){
		this.depart=depart;}
	private void setArrivee(ZonedDateTime arrivee){
		this.arrivee=arrivee;}
	private void setIsOpen(boolean isOpen){
		this.isOpen=isOpen;}
	private void addPass(Passager unPassager){
		this.passager.add(unPassager);}
	private void rmCli(Passager unPassager){
		this.passager.remove(unPassager);}
	



	public Duration duree(){
		return Duration.between(depart, arrivee);
		}
	public void ouvrir(){
		this.setIsOpen(true);
		}
	public void fermee(){
		this.setIsOpen(false);
		}

}

