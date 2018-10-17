package com.donque.simplenotetakingapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class dbhelper extends SQLiteOpenHelper {
    public static final String TAG = "tag";
    public static final String DB_NAME = "app_notes.db";
    public static final int DB_VERSION = 1;

    public static final String TABLE_NOTES = "notes";
    public static final String COL_ID = "id";
    public static final String COL_TITLE = "title";
    public static final String COL_BODY = "body";
    public static final String COL_CREATED_AT = "created_at";
    public static final String COL_UPDATED_AT = "updated_at";

    public dbhelper(Context context, SQLiteDatabase.CursorFactory factory) {
        super(context, DB_NAME, null ,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String createNotesTable = "CREATE TABLE"+TABLE_NOTES+"("+
                COL_ID + "INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT ," +
                COL_TITLE + " TEXT ," +
                COL_BODY +" TEXT ," +
                COL_CREATED_AT +" TEXT," +
                COL_UPDATED_AT+" TEXT" +
                ")";

        sqLiteDatabase.execSQL(createNotesTable);
        Log.d(TAG, createNotesTable);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {



    }
}
