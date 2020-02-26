package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

/* renamed from: ckh */
/* compiled from: PG */
public final class ckh extends cjw {

    /* renamed from: b */
    private static final Uri f5814b = Uri.parse("content://com.google.android.katniss.search.searchapi.VoiceInteractionProvider/sharedvalue");

    public ckh(Context context) {
        super(context, f5814b);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2936a() {
        Cursor query;
        this.f5762a = null;
        try {
            query = getContext().getContentResolver().query(f5814b, null, "key = 'is_listening_for_hotword'", null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    boolean z = true;
                    if (query.getInt(query.getColumnIndex("value")) != 1) {
                        z = false;
                    }
                    this.f5762a = Boolean.valueOf(z);
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e) {
            Log.e("HotwordEnabledLdr", "Exception in loadInBackground()", e);
        } catch (Throwable th) {
            dhr.m6455a(th, th);
        }
        return (Boolean) this.f5762a;
        throw th;
    }
}
