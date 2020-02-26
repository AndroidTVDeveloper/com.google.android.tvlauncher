package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

/* renamed from: ckh  reason: default package */
/* compiled from: PG */
public final class ckh extends cjw {
    private static final Uri b = Uri.parse("content://com.google.android.katniss.search.searchapi.VoiceInteractionProvider/sharedvalue");

    public ckh(Context context) {
        super(context, b);
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Cursor query;
        this.a = null;
        try {
            query = getContext().getContentResolver().query(b, null, "key = 'is_listening_for_hotword'", null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    boolean z = true;
                    if (query.getInt(query.getColumnIndex("value")) != 1) {
                        z = false;
                    }
                    this.a = Boolean.valueOf(z);
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e) {
            Log.e("HotwordEnabledLdr", "Exception in loadInBackground()", e);
        } catch (Throwable th) {
            dhr.a(th, th);
        }
        return (Boolean) this.a;
        throw th;
    }
}
