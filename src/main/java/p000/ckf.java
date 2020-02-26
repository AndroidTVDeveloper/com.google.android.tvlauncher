package p000;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;

/* renamed from: ckf */
/* compiled from: PG */
public final class ckf extends cjw {

    /* renamed from: b */
    private static final String[] f5812b = {"mic_status"};

    public ckf(Context context) {
        super(context, dbd.f8137a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2936a() {
        Cursor query;
        this.f5762a = null;
        try {
            query = getContext().getContentResolver().query(dbd.f8137a, f5812b, null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    this.f5762a = Integer.valueOf(query.getInt(0));
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e) {
            Log.e("FarfieldMicStatusLdr", "Exception in loadInBackground()", e);
        } catch (Throwable th) {
            dhr.m6455a(th, th);
        }
        return (Integer) this.f5762a;
        throw th;
    }
}
