package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;

/* renamed from: ckf  reason: default package */
/* compiled from: PG */
public final class ckf extends cjw {
    private static final String[] b = {"mic_status"};

    public ckf(Context context) {
        super(context, dbd.a);
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Cursor query;
        this.a = null;
        try {
            query = getContext().getContentResolver().query(dbd.a, b, null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    this.a = Integer.valueOf(query.getInt(0));
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e) {
            Log.e("FarfieldMicStatusLdr", "Exception in loadInBackground()", e);
        } catch (Throwable th) {
            dhr.a(th, th);
        }
        return (Integer) this.a;
        throw th;
    }
}
