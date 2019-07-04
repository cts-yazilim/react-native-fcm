package com.evollu.react.fcm;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class SenkronizasyonHelper extends SQLiteOpenHelper  {

    public SenkronizasyonHelper(Context context) {
        super(context, "dataDB", null, 1);
        }

        @Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
    }
    

        public void updateSenkronizasyon() {
            Log.d("TEST","GİRDİM");
            SQLiteDatabase db = this.getWritableDatabase();
            Log.d("TEST","AÇTIM");
            
            ContentValues values = new ContentValues();
            values.put("ZORUNLU_GUNCELLEME_TALEBI", true );
            Log.d("TEST","OLUŞTURDUM");
        
            // updating row
            db.update("SENKRONIZASYONLAR", values, "",null);
            Log.d("TEST","GÜNCELLEDİM");
            db.close();
            Log.d("TEST","KAPADIM");
        
        }
    
}
