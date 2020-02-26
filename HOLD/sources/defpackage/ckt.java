package defpackage;

import android.content.ContentValues;
import android.media.tv.TvContract;
import android.os.AsyncTask;

/* renamed from: ckt  reason: default package */
/* compiled from: PG */
final class ckt extends AsyncTask {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ long b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ cla d;

    public ckt(cla cla, boolean z, long j, boolean z2) {
        this.d = cla;
        this.a = z;
        this.b = j;
        this.c = z2;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("browsable", Boolean.valueOf(this.a));
        cla cla = this.d;
        int i = cla.x;
        return Integer.valueOf(cla.a.getContentResolver().update(TvContract.buildChannelUri(this.b), contentValues, null, null));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (((Integer) obj).intValue() == 1 && this.c) {
            cla cla = this.d;
            int i = cla.x;
            cla.k();
        }
    }
}
