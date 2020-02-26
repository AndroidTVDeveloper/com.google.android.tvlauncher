package defpackage;

import android.content.ContentValues;
import android.media.tv.TvContract;
import android.media.tv.TvInputManager;
import android.os.AsyncTask;

/* renamed from: cku  reason: default package */
/* compiled from: PG */
public final class cku extends AsyncTask {
    private final /* synthetic */ long a;
    private final /* synthetic */ String b;
    private final /* synthetic */ long c;
    private final /* synthetic */ cla d;

    public cku(cla cla, long j, String str, long j2) {
        this.d = cla;
        this.a = j;
        this.b = str;
        this.c = j2;
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
        ContentValues contentValues = new ContentValues();
        contentValues.put("browsable", (Boolean) false);
        cla cla = this.d;
        int i = cla.x;
        int update = cla.a.getContentResolver().update(TvContract.buildPreviewProgramUri(this.a), contentValues, null, null);
        if (update == 1) {
            ((TvInputManager) this.d.a.getSystemService("tv_input")).notifyPreviewProgramBrowsableDisabled(this.b, this.a);
        }
        return Integer.valueOf(update);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (((Integer) obj).intValue() == 1) {
            cla cla = this.d;
            long j = this.c;
            int i = cla.x;
            cla.e(j);
        }
    }
}
