package principal;
import java.security.SecureRandom;
public class AdivinaElNumero {
    SecureRandom random= new SecureRandom ();
    private int numeroSecreto= random.nextInt(40)+1;
    private int numeroUsuario;
    private int intentos=6;
    private boolean numeroGrande;
    private boolean numeroPequeño;
    private boolean gano;

    public double getNumeroIntentos(){
        return intentos;
    }
    public String getIntentos() {
        String intento = String.valueOf(intentos);
        return intento;
    }

    public boolean isNumeroGrande() {
        return numeroGrande;
    }

    public boolean isNumeroPequeño() {
        return numeroPequeño;
    }

    public boolean isGano() {
        return gano;
    }
        public void realizarJugada(int numero){
        numeroGrande=false;
        numeroPequeño = false;
        gano = false;
        numeroUsuario=numero;
        intentos--;
        if (numeroUsuario<numeroSecreto){
            numeroPequeño=true;
        } if(numeroUsuario>numeroSecreto){
            numeroGrande=true;
        } if(numeroUsuario==numeroSecreto){
            gano=true;
        }
    }

}
