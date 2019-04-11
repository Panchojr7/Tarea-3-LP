package Clases;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

/**
 * Created by Neekuu on 13-05-2016.
 */
public class cInterfaz {
    public Label nuMeChi;
    public Label nuMeMe;
    public Label nuMeGra;
    public Label nuEmpCo;
    public Label nuEmpMe;
    public Label nuDeRe;
    public Label nuDeBo;
    public Label nuDeEs;
    public Label CPInf;
    public Label CAInf;
    public Label CSInf;
    public Label CRInf;
    public Label ESTInfo;
    public Label Dinero;
    public Label nuCoCos;
    public Label nuCoPre;
    public Label COSInf;
    public Label INGInf;
    public Label SUEInf;
    public Label RESInf;
    public Label DiaInfo;
    public Label laPreMe;
    public Label laPreDe;
    public Pane Winner;
    public Pane Looser;

    private Local catAndDrink = new Local();

    public void clickCoEmpCo(ActionEvent actionEvent) {
        catAndDrink.contratarBarman();
        nuEmpCo.setText(String.valueOf(catAndDrink.cantidadBarmans()));
    }

    public void clickVeMeChi(ActionEvent actionEvent) {
        catAndDrink.venderMesaChica();
        nuMeChi.setText(String.valueOf(catAndDrink.getNumeroMesaChica()));
        Dinero.setText(String.valueOf(catAndDrink.getDineroActual()));

    }

    public void clickCoMeChi(ActionEvent actionEvent) {
        catAndDrink.comprarMesaChica();
        nuMeChi.setText( String.valueOf(catAndDrink.getNumeroMesaChica()));
        Dinero.setText(String.valueOf(catAndDrink.getDineroActual()));
        if(catAndDrink.getDineroActual()<=0){
            Looser.setVisible(true);
        }
    }

    public void clickCoMeMe(ActionEvent actionEvent) {
        catAndDrink.comprarMesaMediana();
        nuMeMe.setText(String.valueOf(catAndDrink.getNumeroMesaMediana()));
        Dinero.setText(String.valueOf(catAndDrink.getDineroActual()));
        if(catAndDrink.getDineroActual()<=0){
            Looser.setVisible(true);
        }
    }

    public void clickVeMeMe(ActionEvent actionEvent) {
        catAndDrink.venderMesaMediana();
        nuMeMe.setText(String.valueOf(catAndDrink.getNumeroMesaMediana()));
        Dinero.setText(String.valueOf(catAndDrink.getDineroActual()));
    }

    public void clickCoMeGra(ActionEvent actionEvent) {
        catAndDrink.comprarMesaGrande();
        nuMeGra.setText(String.valueOf(catAndDrink.getNumeroMesaGrande()));
        Dinero.setText(String.valueOf(catAndDrink.getDineroActual()));
        if(catAndDrink.getDineroActual()<=0){
            Looser.setVisible(true);
        }
    }


    public void clickVeMeGra(ActionEvent actionEvent) {
        catAndDrink.venderMesaGrande();
        nuMeGra.setText(String.valueOf(catAndDrink.getNumeroMesaGrande()));
        Dinero.setText(String.valueOf(catAndDrink.getDineroActual()));
    }

    public void clickDeEmpCo(ActionEvent actionEvent) {
        catAndDrink.despedirBarman();
        nuEmpCo.setText(String.valueOf(catAndDrink.cantidadBarmans()));
    }

    public void clickCoEmpMe(ActionEvent actionEvent) {
        catAndDrink.contratarGarzon();
        nuEmpMe.setText(String.valueOf(catAndDrink.cantidadGarzones()));

    }

    public void clickDeEmpMe(ActionEvent actionEvent) {
        catAndDrink.despedirGarzon();
        nuEmpCo.setText(String.valueOf(catAndDrink.cantidadGarzones()));
    }

    public void clickCoDeRe(ActionEvent actionEvent) {
        catAndDrink.comprarDecoracionRegular();
        nuDeRe.setText(String.valueOf(catAndDrink.getNumeroDecoracionRegular()));
        Dinero.setText(String.valueOf(catAndDrink.getDineroActual()));
        if(catAndDrink.getDineroActual()<=0){
            Looser.setVisible(true);
        }
    }

    public void clickVeDeRe(ActionEvent actionEvent) {
        catAndDrink.venderDecoracionRegular();
        nuDeRe.setText(String.valueOf(catAndDrink.getNumeroDecoracionRegular()));
        Dinero.setText(String.valueOf(catAndDrink.getDineroActual()));
    }

    public void clickCoDeBo(ActionEvent actionEvent) {
        catAndDrink.comprarDecoracionBonita();
        nuDeBo.setText(String.valueOf(catAndDrink.getNumeroDecoracionBonita()));
        Dinero.setText(String.valueOf(catAndDrink.getDineroActual()));
        if(catAndDrink.getDineroActual()<=0){
            Looser.setVisible(true);
        }
    }

    public void clickVeDeBo(ActionEvent actionEvent) {
        catAndDrink.venderDecoracionBonita();
        nuDeBo.setText(String.valueOf(catAndDrink.getNumeroDecoracionBonita()));
        Dinero.setText(String.valueOf(catAndDrink.getDineroActual()));
    }

    public void clickCoDeEs(ActionEvent actionEvent) {
        catAndDrink.comprarDecoracionEspectacular();
        nuDeEs.setText(String.valueOf(catAndDrink.getNumeroDecoracionEspectacular()));
        Dinero.setText(String.valueOf(catAndDrink.getDineroActual()));
        if(catAndDrink.getDineroActual()<=0){
            Looser.setVisible(true);
        }

    }

    public void clickVeDeEs(ActionEvent actionEvent) {
        catAndDrink.venderDecoracionEspectacular();
        nuDeEs.setText(String.valueOf(catAndDrink.getNumeroDecoracionEspectacular()));
        Dinero.setText(String.valueOf(catAndDrink.getDineroActual()));
    }

    public void clickTrabajar(ActionEvent actionEvent) {
        catAndDrink.realizarDia();
        Dia diaactual = catAndDrink.getDiaActual();
        CPInf.setText(String.valueOf(diaactual.getClientesPotenciales()));
        CAInf.setText(String.valueOf(diaactual.getClientesAtendidos()));
        CSInf.setText(String.valueOf(diaactual.getClientesSentados()));
        CRInf.setText(String.valueOf(diaactual.getClientesRecibidos()));
        COSInf.setText(String.valueOf(diaactual.getCosto()));
        INGInf.setText(String.valueOf(diaactual.getIngreso()));
        SUEInf.setText(String.valueOf(diaactual.getSueldo()));
        RESInf.setText(String.valueOf(diaactual.getResultado()));
        Dinero.setText(String.valueOf(catAndDrink.getDineroActual()));
        DiaInfo.setText(String.valueOf(catAndDrink.getNumeroDia()));
        ESTInfo.setText(String.valueOf(catAndDrink.getNumeroEstrellas()));
        if(catAndDrink.getNumeroEstrellas()==5){
            Winner.setVisible(true);
        }
        else if(catAndDrink.getDineroActual()<=0){
            Looser.setVisible(true);
        }

    }

    public void clickCoMePi(ActionEvent actionEvent) {
        catAndDrink.mejorarTrago();
        nuCoPre.setText(String.valueOf(catAndDrink.getPrecioTrago()));
        nuCoCos.setText(String.valueOf(catAndDrink.getCostoTrago()));
    }

    
    
    
    
    public void inCoMeChi(Event event) {
        laPreMe.setVisible(true);
        laPreMe.setText("Precio compra:"+String.valueOf(catAndDrink.getPrecioMesaChica()));

    }
    public void inVeMeChi(Event event) {
        laPreMe.setVisible(true);
        laPreMe.setText("Precio venta:"+String.valueOf(catAndDrink.getPrecioMesaChica()-100));
    }
    public void inCoMeMe(Event event) {
        laPreMe.setVisible(true);
        laPreMe.setText("Precio compra:"+String.valueOf(catAndDrink.getPrecioMesaMediana()));

    }
    public void inCoVeMe(Event event) {
        laPreMe.setVisible(true);
        laPreMe.setText("Precio venta:"+String.valueOf(catAndDrink.getPrecioMesaMediana()-200));
    }
    public void inCoMeGra(Event event) {
        laPreMe.setVisible(true);
        laPreMe.setText("Precio compra:"+String.valueOf(catAndDrink.getPrecioMesaGrande()));
    }
    public void inVeMeGra(Event event) {
        laPreMe.setVisible(true);
        laPreMe.setText("Precio compra:"+String.valueOf(catAndDrink.getPrecioMesaGrande()-300));
    }


    public void outClickMesa(Event event) {
        laPreMe.setVisible(false);
    }


    public void inCoDeRe(Event event) {
        laPreDe.setVisible(true);
        laPreDe.setText("Precio compra:"+String.valueOf(catAndDrink.getPrecioDeRe()));
    }

    public void inCoDeBo(Event event) {
        laPreDe.setVisible(true);
        laPreDe.setText("Precio compra:"+String.valueOf(catAndDrink.getPrecioDeBo()));
    }

    public void inCoDeEs(Event event) {
        laPreDe.setVisible(true);
        laPreDe.setText("Precio compra:"+String.valueOf(catAndDrink.getPrecioDeEs()));
    }

    public void inVeDeRe(Event event) {
        laPreDe.setVisible(true);
        laPreDe.setText("Precio venta:"+String.valueOf(catAndDrink.getPrecioDeRe()-75));
    }

    public void inVeDeBo(Event event) {
        laPreDe.setVisible(true);
        laPreDe.setText("Precio venta:"+String.valueOf(catAndDrink.getPrecioDeBo()-150));
    }

    public void inVeDeEs(Event event) {
        laPreDe.setVisible(true);
        laPreDe.setText("Precio venta:"+String.valueOf(catAndDrink.getPrecioDeRe()-300));
    }

    public void outClickDeco(Event event) {
        laPreDe.setVisible(false);
    }
}
        