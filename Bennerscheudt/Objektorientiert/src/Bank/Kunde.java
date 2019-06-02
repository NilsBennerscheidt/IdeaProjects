package Bank;

 class Kunde {

      String vName;
      String nName;




     public Konto[] konto;

     public Kunde() {
         konto = new Konto[10];
     }

     static void KundenDaten(){

     }

     public String getvName() {
         return vName;
     }

     public void setvName(String vName) {
         this.vName = vName;
     }

     public String getnName() {
         return nName;
     }

     public void setnName(String nName) {
         this.nName = nName;
     }

     public Konto[] getKonto() {
         return konto;
     }

     public void setKonto(Konto[] konto) {
         this.konto = konto;
     }
 }
