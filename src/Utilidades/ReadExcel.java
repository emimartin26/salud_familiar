/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

/**
 *
 * @author Emiliano
 */
import Hibernate.GestorHibernate;
import Hibernate.HibernateUtil;
import Model.Ubicacion.Pais;
//import jxl.*;
import java.io.*;

public class ReadExcel {

    private void leerArchivoExcel(String archivoDestino) {
//////        GestorHibernate gestorHibernate = new GestorHibernate();
//        try {
//            Workbook archivoExcel = Workbook.getWorkbook(new File(archivoDestino));
//            //System.out.println("Número de Hojas\t" + archivoExcel.getNumberOfSheets());
//            for (int sheetNo = 0; sheetNo < archivoExcel.getNumberOfSheets(); sheetNo++) // Recorre cada    hoja                                                                                                                                                       
//            {
//                Sheet hoja = archivoExcel.getSheet(sheetNo);
//                int numColumnas = hoja.getColumns();
//                int numFilas = hoja.getRows();
//                String data;
//                //System.out.println("Nombre de la Hoja\t" + archivoExcel.getSheet(sheetNo).getName());
//                for (int fila = 0; fila < numFilas; fila++) { // Recorre cada fila de la hoja
//                    data = hoja.getCell(0, fila).getContents();
//                    data = hoja.getCell(0, fila).getContents();
//////                    Pais pais = new Pais();
//////                    pais.setNombre(data.toLowerCase());
//////                    gestorHibernate.guardarObjeto(pais);
//////                    System.out.println(data.toLowerCase());
////////
////                    for (int columna = 0; columna < numColumnas; columna++) { // Recorre   cada columna   de la fila                                                                       
////                        data = hoja.getCell(columna, fila).getContents();
////                        Cell a1 = hoja.getCell(fila, 0);
////                        System.out.print(a1.getContents());
////                        //System.out.print(data + " ");
////                    }
//                    //System.out.println("\n");
//                }
//            }
//        } catch (Exception ioe) {
//            ioe.printStackTrace();
//        }

    }

    public static void main(String arg[]) {
        HibernateUtil.inicializar();
        ReadExcel excel = new ReadExcel();
        excel.leerArchivoExcel("c:\\paises.xls");
    }
}
