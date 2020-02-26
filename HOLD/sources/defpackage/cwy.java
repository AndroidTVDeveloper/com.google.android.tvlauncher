package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

/* renamed from: cwy  reason: default package */
/* compiled from: PG */
final class cwy extends AsyncTask {
    private final /* synthetic */ cwz a;

    public cwy(cwz cwz) {
        this.a = cwz;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        String[] strArr;
        Void[] voidArr = (Void[]) objArr;
        ContentResolver contentResolver = this.a.a.getContentResolver();
        cwz cwz = this.a;
        Uri uri = cwz.c;
        if (cwz.f != 1) {
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
            cwz cwz = this.a;
            if (cwz.h) {
                cwz.d = str;
                cwz.g();
                cwz cwz2 = this.a;
                if (!cwz2.i) {
                    cwz2.b.setStreamVolume(0.0f);
                }
            }
        }
    }
}
