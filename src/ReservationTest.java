package reservation;

import org.junit.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ReservationTest{

  Reservation r = new Reservation();

// Confirmation sans payer
 @Test(expected = RuntimeException.class)
 public void confirmerTest(){
  r.annuler();
  r.confirmer();
 }

// Ne peut pas payer une reservation payer, annuler ou confirmer
 @Test(expected = RuntimeException.class)
 public void payerTest(){
  r.payer();
  r.payer();
 }






}
