package Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by nahid on 4/22/16.
 */
public class dataBase extends SQLiteOpenHelper {

    public static final String dataBase_Name="Reduca71.db";
    public static final String table_Name="Criteria";
    public static final String Col1="Country";
    public static final String Col2="forest";
    public static final String Col3="agriculture";
    public static final String Col4="industry";
    public static final String Col5="residential";
    public static final String Col6="water";
    public static final String Col7="energy";
    public static final String Col8="transport";

    public dataBase(Context context) {
        super(context, dataBase_Name, null,1);

        SQLiteDatabase db=this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE"+table_Name+"( country TEXT PRIMARY KEY, forest INTEGER, agriculture INTEGER, industry INTEGER, residential INTEGER, water INTEGER, energy INTEGER, transport INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXITS"+table_Name);
        onCreate(db);
    }
}
