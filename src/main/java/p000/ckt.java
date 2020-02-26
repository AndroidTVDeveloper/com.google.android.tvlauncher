package p000;

import android.content.ContentValues;
import android.media.tv.TvContract;
import android.os.AsyncTask;

/* renamed from: ckt */
/* compiled from: PG */
final class ckt extends AsyncTask {

    /* renamed from: a */
    private final /* synthetic */ boolean f5831a;

    /* renamed from: b */
    private final /* synthetic */ long f5832b;

    /* renamed from: c */
    private final /* synthetic */ boolean f5833c;

    /* renamed from: d */
    private final /* synthetic */ cla f5834d;

    public ckt(cla cla, boolean z, long j, boolean z2) {
        this.f5834d = cla;
        this.f5831a = z;
        this.f5832b = j;
        this.f5833c = z2;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("browsable", Boolean.valueOf(this.f5831a));
        cla cla = this.f5834d;
        int i = cla.f5856x;
        return Integer.valueOf(cla.f5873a.getContentResolver().update(TvContract.buildChannelUri(this.f5832b), contentValues, null, null));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (((Integer) obj).intValue() == 1 && this.f5833c) {
            cla cla = this.f5834d;
            int i = cla.f5856x;
            cla.mo3077k();
        }
    }
}
