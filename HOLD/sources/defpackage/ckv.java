package defpackage;

import android.content.ContentValues;
import android.media.tv.TvContract;
import android.media.tv.TvInputManager;
import android.net.Uri;
import android.os.AsyncTask;

/* renamed from: ckv  reason: default package */
/* compiled from: PG */
public final class ckv extends AsyncTask {
    private final /* synthetic */ long a;
    private final /* synthetic */ String b;
    private final /* synthetic */ cla c;

    public ckv(cla cla, long j, String str) {
        this.c = cla;
        this.a = j;
        this.b = str;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void} */
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Uri buildWatchNextProgramUri = TvContract.buildWatchNextProgramUri(this.a);
        ContentValues contentValues = new ContentValues();
        contentValues.put("browsable", (Boolean) false);
        cla cla = this.c;
        int i = cla.x;
        int update = cla.a.getContentResolver().update(buildWatchNextProgramUri, contentValues, null, null);
        if (update == 1) {
            ((TvInputManager) this.c.a.getSystemService("tv_input")).notifyWatchNextProgramBrowsableDisabled(this.b, this.a);
        }
        return Integer.valueOf(update);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (((Integer) obj).intValue() == 1) {
            cla cla = this.c;
            int i = cla.x;
            cla.n();
        }
    }
}
