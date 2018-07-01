package com.avatech.challenge.journal.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.avatech.challenge.journal.data.DiaryContract.DiaryEntry;
/**
 * Created by AvatechNG on 7/30/2018.
 */

public class DiaryDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME ="databaserr.db";
    private static final int DATABASE_VERSION = 1;
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS "+DiaryEntry.TABLE_NAME+
                                               "("+ DiaryEntry._ID +" INTEGER PRIMARY KEY AUTOINCREMENT, "+
                                                  DiaryEntry.COLUMN_TITLE+ " TEXT DEFAULT UNKNOWN," +
                                                  DiaryEntry.COLUMN_DATE+" TEXT, "+
                                                  DiaryEntry.COLUMN_IMAGE_DATA +" BLOB, " +
                                                  DiaryEntry.COLUMN_DESCRIPTION+" TEXT )";

    public DiaryDbHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
             db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}