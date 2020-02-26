package p000;

import android.content.ContentValues;
import android.media.tv.TvContract;
import android.media.tv.TvInputManager;
import android.net.Uri;
import android.os.AsyncTask;

/* renamed from: ckv */
/* compiled from: PG */
public final class ckv extends AsyncTask {

    /* renamed from: a */
    private final /* synthetic */ long f5839a;

    /* renamed from: b */
    private final /* synthetic */ String f5840b;

    /* renamed from: c */
    private final /* synthetic */ cla f5841c;

    public ckv(cla cla, long j, String str) {
        this.f5841c = cla;
        this.f5839a = j;
        this.f5840b = str;
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
        Uri buildWatchNextProgramUri = TvContract.buildWatchNextProgramUri(this.f5839a);
        ContentValues contentValues = new ContentValues();
        contentValues.put("browsable", (Boolean) false);
        cla cla = this.f5841c;
        int i = cla.f5856x;
        int update = cla.f5873a.getContentResolver().update(buildWatchNextProgramUri, contentValues, null, null);
        if (update == 1) {
            ((TvInputManager) this.f5841c.f5873a.getSystemService("tv_input")).notifyWatchNextProgramBrowsableDisabled(this.f5840b, this.f5839a);
        }
        return Integer.valueOf(update);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (((Integer) obj).intValue() == 1) {
            cla cla = this.f5841c;
            int i = cla.f5856x;
            cla.mo3080n();
        }
    }
}
