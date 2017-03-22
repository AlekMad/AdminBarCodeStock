package madr.com.co.adminbarcodestock;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ceiba on 2/27/2017.
 */

public class DBHelper  extends SQLiteOpenHelper{
    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table usuarios(codigo integer primary key autoincrement,usuario text,contrasena text)");
        db.execSQL("insert into usuarios values(1,'admin','admin')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("create table usuarios(codigo integer primary key autoincrement,usuario text,contrasena text)");
        db.execSQL("insert into usuarios values(1,'admin','admin')");
    }

    /*@Override
    public  void onList(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("create table articulos(codigo integer primary key autoincrement,codigoArticulo text,nombreArticulo text)");
        db.execSQL("insert into articulos values (codigoArticulo, nombreArticulo ) ");
    }
    */

}
