package com.beinggreenrobot.support.content.loaderasync;

import android.os.AsyncTask;
import android.support.v4.content.Loader;

public abstract class ContentChangingTask extends
    AsyncTask<Object, Void, Void> {
  private Loader<?> loader=null;

  public ContentChangingTask(Loader<?> loader) {
    this.loader=loader;
  }

  @Override
  protected void onPostExecute(Void param) {
    loader.onContentChanged();
  }
}
