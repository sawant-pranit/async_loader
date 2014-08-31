package com.beinggreenrobot.content.loaderasync;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;

@Deprecated
public class SQLiteInsertTask
  extends AsyncTask<Void, Void, Exception> {
  SQLiteDatabase db;
  String table;
  String nullColumnHack;
  ContentValues values;
  
  public SQLiteInsertTask(SQLiteDatabase db, String table,
                           String nullColumnHack,
                           ContentValues values) {
    this.db=db;
    this.table=table;
    this.nullColumnHack=nullColumnHack;
    this.values=values;
  }
  
  @Override
  protected Exception doInBackground(Void... params) {
    try {
      db.insert(table, nullColumnHack, values);
    }
    catch (Exception e) {
      return(e);
    }
    
    return(null);
  }
}
