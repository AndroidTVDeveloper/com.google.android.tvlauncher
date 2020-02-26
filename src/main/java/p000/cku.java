package p000;

import android.content.ContentValues;
import android.media.tv.TvContract;
import android.media.tv.TvInputManager;
import android.os.AsyncTask;

/* renamed from: cku */
/* compiled from: PG */
public final class cku extends AsyncTask {

    /* renamed from: a */
    private final /* synthetic */ long f5835a;

    /* renamed from: b */
    private final /* synthetic */ String f5836b;

    /* renamed from: c */
    private final /* synthetic */ long f5837c;

    /* renamed from: d */
    private final /* synthetic */ cla f5838d;

    public cku(cla cla, long j, String str, long j2) {
        this.f5838d = cla;
        this.f5835a = j;
        this.f5836b = str;
        this.f5837c = j2;
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
        cla cla = this.f5838d;
        int i = cla.f5856x;
        int update = cla.f5873a.getContentResolver().update(TvContract.buildPreviewProgramUri(this.f5835a), contentValues, null, null);
        if (update == 1) {
            ((TvInputManager) this.f5838d.f5873a.getSystemService("tv_input")).notifyPreviewProgramBrowsableDisabled(this.f5836b, this.f5835a);
        }
        return Integer.valueOf(update);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (((Integer) obj).intValue() == 1) {
            cla cla = this.f5838d;
            long j = this.f5837c;
            int i = cla.f5856x;
            cla.mo3071e(j);
        }
    }
}
