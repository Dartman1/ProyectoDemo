package programaciondario_1.proyectodemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Maye y Dari on 14/11/2016.
 */

public class DataBaseManager  {

    public static final String TABLE_NAME = "registro";
    public static final String ET_Nombre = "nombre";
    public static final String ET_Apellido = "apellido";
    public static final String ET_Correo = "correo";
    public static final String ET_Telefono = "telefono";
    public static final String ET_Usuario = "usuario";
    public static final String ET_Contraseña = "contraseña";

    public static final  String CREATE_TABLE = " create table " +TABLE_NAME+ " ("
            + ET_Nombre + "text not null,"
            + ET_Apellido + "text not null,"
            + ET_Correo + "text not null,"
            + ET_Telefono + "text not null,"
            + ET_Usuario + "text not null,"
            + ET_Contraseña + "text not null);";

        private DbHelper helper;
        private SQLiteDatabase db;

    public DataBaseManager(Context context) {

        helper = new DbHelper(context);
        db = helper.getWritableDatabase();

    }

    private ContentValues generarContentValues(String nombre, String apellido, String correo, String telefono, String usuario, String contreseña){

        ContentValues valores = new ContentValues();
        valores.put(ET_Nombre, nombre);
        valores.put(ET_Apellido, apellido);
        valores.put(ET_Correo, correo);
        valores.put(ET_Telefono, telefono);
        valores.put(ET_Usuario, usuario);
        valores.put(ET_Contraseña, contreseña);

        return valores;
    }

    public void insertar (String nombre, String apellido, String correo, String telefono, String usuario, String contreseña){

               db.insert(TABLE_NAME,null,generarContentValues(nombre, apellido, correo, telefono, usuario, contreseña));
    }

    public  void modicarlogin (String nombre, String nuevacontraseña){

            db.update(TABLE_NAME,generarContentValues(nombre, " ", " ", " "," ", nuevacontraseña), ET_Contraseña + "=?", new String[]{nombre} );
    }


}

