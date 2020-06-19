package ClientePeso;

import android.widget.ImageSwitcher;

public class CalcularPesoIdeal {
    private int categoria;
    private int peso;
    private int talla;

    private float imc;
    private ImageSwitcher myImgView;

    public CalcularPesoIdeal(int categoria, int peso, int talla) {
        this.categoria = categoria;
        this.peso = peso;
        this.talla = talla;
    }

    public CalcularPesoIdeal(){

    }
    //Methods
    public double calcularIMC(){
        float imc = (float) (Math.round((peso/Math.pow(talla,2)) * 1000000) / 100.0);
        this.imc = imc;
        return imc;
    }

    public String resultadoDePesoIdeal() {
        calcularIMC();
        String msg;
        if (imc <= 18.5) {
            msg = "Su peso es demasiado bajo";
        } else if (imc < 25) {
            msg = "Su peso es ideal";
        } else if (imc < 30) {
            msg = "Usted presemnta sobrepeso";
        } else {
            msg = "Usted presenta obesidad";
        }
        return msg;
    }

    public String mostrarResultado() {
        String msg;
        msg = "Su peso es : " + this.peso + " Kg\n";
        msg = msg + "Su talla es  : " + (this.talla/100.0) + " m\n";
        msg = msg + "Su imc es   : " + (Math.round((peso/Math.pow(talla,2)) * 1000000) / 100.0) + "\n\n";
        msg = msg + resultadoDePesoIdeal();
        return msg;
    }


    //set & get methods
    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }
}
