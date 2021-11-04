package cegeka.scoaladevalori.ro.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewFinal;

    private boolean folositInm = false;
    private double val_1 = 0;
    private double val_2 = 0;
    private boolean folositPlus = false;
    private boolean folositScadere = false;
    private boolean folositImp = false;
    private double rezultat = 0;
    private boolean folositEgal = false;
    private boolean folositPutere = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void actualizeazaText(double vall)
    {
        String str = Double.valueOf(vall).toString();
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(str);
    }
    public void adauga0(View view)
    {
        if (folositImp == false && folositScadere == false && folositInm == false && folositPlus == false && folositEgal == false && folositPutere == false)
        {
            val_1 = val_1 * 10 + 0;
            actualizeazaText(val_1);
        }
        else
        {
            val_2 = val_2 * 10 + 0;
            actualizeazaText(val_2);
        }
    }
    public void adauga1(View view)
    {
        if (folositImp == false && folositScadere == false && folositInm == false && folositPlus == false && folositEgal == false && folositPutere == false)
        {
            val_1 = val_1 * 10 + 1;
            actualizeazaText(val_1);
        }
        else
        {
            val_2 = val_2 * 10 + 1;
            actualizeazaText(val_2);
        }
    }
    public void adauga2(View view)
    {
        if (folositImp == false && folositScadere == false && folositInm == false && folositPlus == false && folositEgal == false && folositPutere == false)
        {
            val_1 = val_1 * 10 + 2;
            actualizeazaText(val_1);
        }
        else
        {
            val_2 = val_2 * 10 + 2;
            actualizeazaText(val_2);
        }
    }
    public void adauga3(View view)
    {
        if (folositImp == false && folositScadere == false && folositInm == false && folositPlus == false && folositEgal == false && folositPutere == false)
        {
            val_1 = val_1 * 10 + 3;
            actualizeazaText(val_1);
        }
        else
        {
            val_2 = val_2 * 10 + 3;
            actualizeazaText(val_2);
        }
    }
    public void adauga4(View view)
    {
        if (folositImp == false && folositScadere == false && folositInm == false && folositPlus == false && folositEgal == false && folositPutere == false)
        {
            val_1 = val_1 * 10 + 4;
            actualizeazaText(val_1);
        }
        else
        {
            val_2 = val_2 * 10 + 4;
            actualizeazaText(val_2);
        }
    }
    public void adauga5(View view)
    {
        if (folositImp == false && folositScadere == false && folositInm == false && folositPlus == false && folositEgal == false && folositPutere == false)
        {
            val_1 = val_1 * 10 + 5;
            actualizeazaText(val_1);
        }
        else
        {
            val_2 = val_2 * 10 + 5;
            actualizeazaText(val_2);
        }
    }
    public void adauga6(View view)
    {
        if (folositImp == false && folositScadere == false && folositInm == false && folositPlus == false && folositEgal == false && folositPutere == false)
        {
            val_1 = val_1 * 10 + 6;
            actualizeazaText(val_1);
        }
        else
        {
            val_2 = val_2 * 10 + 6;
            actualizeazaText(val_2);
        }
    }
    public void adauga7(View view)
    {
        if (folositImp == false && folositScadere == false && folositInm == false && folositPlus == false && folositEgal == false && folositPutere == false)
        {
            val_1 = val_1 * 10 + 7;
            actualizeazaText(val_1);
        }
        else
        {
            val_2 = val_2 * 10 + 7;
            actualizeazaText(val_2);
        }
    }
    public void adauga8(View view)
    {
        if (folositImp == false && folositScadere == false && folositInm == false && folositPlus == false && folositEgal == false && folositPutere == false)
        {
            val_1 = val_1 * 10 + 8;
            actualizeazaText(val_1);
        }
        else
        {
            val_2 = val_2 * 10 + 8;
            actualizeazaText(val_2);
        }
    }
    public void adauga9(View view)
    {
        if (folositImp == false && folositScadere == false && folositInm == false && folositPlus == false && folositEgal == false  && folositPutere == false)
        {
            val_1 = val_1 * 10 + 9;
            actualizeazaText(val_1);
        }
        else
        {
            val_2 = val_2 * 10 + 9;
            actualizeazaText(val_2);
        }
    }
    public void plus(View view)
    {
        folositPlus = true;
    }
    public void scadere(View view)
    {
        folositScadere = true;
    }
    public void inmultire(View view)
    {
        folositInm = true;
    }
    public void impartire(View view)
    {
        folositImp = true;
    }
    public void sinus(View view){
        double unghi = val_1;
        double unghiRad = Math.toRadians(unghi);
        double val_sin = Math.sin(unghiRad);
        actualizeazaText(val_sin);
        val_1 = val_sin;
    }
    public void cosinus(View view){
        double unghi = val_1;
        double unghiRad = Math.toRadians(unghi);
        double val_cos = Math.cos(unghiRad);
        actualizeazaText(val_cos);
        val_1 = val_cos;
    }
    public void tangenta(View view){
        double unghi = val_1;
        double unghiRad = Math.toRadians(unghi);
        double val_tg = Math.tan(unghiRad);
        actualizeazaText(val_tg);
        val_1 = val_tg;
    }
    public void patrat(View view)
    {
        double aux = val_1;
        val_1 = aux * aux;
        actualizeazaText(val_1);
    }
    public void radical(View view)
    {
        double aux = val_1;
        val_1 = Math.sqrt(aux);
        actualizeazaText(val_1);
    }
    public void putere(View view)
    {
        folositPutere = true;
    }
    public void clear(View view)
    {
        val_1 = 0;
        val_2 = 0;
        rezultat = 0;
        folositEgal = false;
        folositImp = false;
        folositInm = false;
        folositPlus = false;
        folositScadere = false;
        TextView textViewFinal = (TextView)findViewById(R.id.textView);
        textViewFinal.setText("");
    }
    public void egalPlus()
    {
        rezultat = val_1 + val_2;
        actualizeazaText(rezultat);
        folositPlus = false;
        val_1 = rezultat;
        folositEgal = false;
        val_2 = 0;
    }
    public void egalScadere()
    {
        rezultat = val_1 - val_2;
        actualizeazaText(rezultat);
        folositScadere = false;
        val_1 = rezultat;
        folositEgal = false;
        val_2 = 0;
    }
    public void egalInm()
    {
        rezultat = val_1 * val_2;
        actualizeazaText(rezultat);
        folositInm = false;
        val_1 = rezultat;
        folositEgal = false;
        val_2 = 0;
    }
    public void egalImp()
    {
        rezultat = val_1 / val_2;
        actualizeazaText(rezultat);
        folositImp = false;
        val_1 = rezultat;
        folositEgal = false;
        val_2 = 0;
    }
    public void egalPutere()
    {
        double cv1 = val_1;
        double cv2 = val_2;
        val_1 = Math.pow(cv1,cv2);
        actualizeazaText(val_1);
        folositPutere = false;
        folositEgal = false;
        val_2 = 0;
    }
    public void egal(View view)
    {
        folositEgal = true;
        if (folositPlus)
            egalPlus();
        else
            if (folositScadere)
                egalScadere();
            else
                if (folositInm)
                    egalInm();
                else
                    if (folositImp)
                        egalImp();
                    else
                        if(folositPutere)
                           egalPutere();
                         else
                             actualizeazaText(val_1);
    }

}
