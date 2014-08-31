package com.beinggreenrobot.content.loaderasync;

import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;

@Deprecated
public class SQLiteDeleteTask
  extends AsyncTask<Void, Void, Exception> {
  SQLiteDatabase db;
  String table;
  String selection;
  String[] args;
  
  public SQLiteDeleteTask(SQLiteDatabase db, String table,
                           String selection,
                           String[] args) {
    this.db=db;
    this.table=table;
    this.selection=selection;
    this.args=args;
  }
  
  @Override
  protected Exception doInBackground(Void... params) {
    try {
      db.delete(table, selection, args);
    }
    catch (Exception e) {
      return(e);
    }
    
    return(null);
  }
}
