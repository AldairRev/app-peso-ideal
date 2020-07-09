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
            msg = "Tiene un peso muy bajo";
        } else if (imc < 25) {
            msg = "Tiene un peso normal";
        } else if (imc < 30) {
            msg = "Usted presenta sobrepeso";
        } else {
            msg = "Usted presenta obesidad";
        }
        return msg;
    }

    public String mostrarResultado() {
        String msg;
        msg = resultadoDePesoIdeal() + "\n\n\n\n";
        msg = msg + "IMC         : " + (Math.round((peso/Math.pow(talla,2)) * 1000000) / 100.0) + "\n";
        msg = msg + "Altura      : " + (this.talla/100.0) + " m\n";
        msg = msg + " Peso       : " + this.peso +  " Kg \n\n";
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
