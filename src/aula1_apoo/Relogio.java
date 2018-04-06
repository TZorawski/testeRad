package aula1_apoo;

/**
 *
 * @author thais
 */
public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    public void imprime (){
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }
    
    public void setHora (int hora) {
        if (hora>=0 && hora<=23) {
            this.hora = hora;
        }
    }
    
    public void incrementaSegundo () {
        if (this.segundo == 59) {
            if (this.minuto == 59) {
                if (this.hora == 23) {
                    this.hora = 0;
                } else {
                    this.hora++;
                }
                this.minuto = 0;
            } else {
                this.minuto++;
            }
            this.segundo = 0;
        } else {
            this.segundo++;
        }
    }
}
