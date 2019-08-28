package Paquetes.Servicios;

import javax.swing.table.TableRowSorter;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class DeletePasteThread implements Runnable {
    PasteServices pasteServices;
    @Override
    public void run() {
        pasteServices= PasteServices.getInstancia();
        while (true){
            Date fecha = new Date();

            pasteServices.deleteByDate();
            try {
                Thread.sleep(300000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }

}