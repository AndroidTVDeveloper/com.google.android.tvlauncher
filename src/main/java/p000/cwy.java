package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

/* renamed from: cwy */
/* compiled from: PG */
final class cwy extends AsyncTask {

    /* renamed from: a */
    private final /* synthetic */ cwz f7801a;

    public cwy(cwz cwz) {
        this.f7801a = cwz;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        String[] strArr;
        Void[] voidArr = (Void[]) objArr;
        ContentResolver contentResolver = this.f7801a.f7802a.getContentResolver();
        cwz cwz = this.f7801a;
        Uri uri = cwz.f7804c;
        if (cwz.f7807f != 1) {
            strArr = new String[]{"input_id"};
        } else {
            strArr = new String[]{"input_id"};
        }
        Cursor query = contentResolver.query(uri, strArr, null, null, null);
        String str = null;
        if (query != null && query.moveToNext()) {
            str = query.getString(0);
        }
        if (query != null) {
            query.close();
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        super.onPostExecute(str);
        if (str != null) {
            cwz cwz = this.f7801a;
            if (cwz.f7809h) {
                cwz.f7805d = str;
                cwz.mo3907g();
                cwz cwz2 = this.f7801a;
                if (!cwz2.f7810i) {
                    cwz2.f7803b.setStreamVolume(0.0f);
                }
            }
        }
    }
}
