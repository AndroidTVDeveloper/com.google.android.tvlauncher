package p000;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;

/* renamed from: clc */
/* compiled from: PG */
public final class clc extends cjw {
    public clc(Context context) {
        super(context, cts.f7418b);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2936a() {
        Cursor query;
        this.f5762a = null;
        try {
            query = getContext().getContentResolver().query(cts.f7418b, null, null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    int count = query.getCount();
                    int columnIndex = query.getColumnIndex("suggestion");
                    this.f5762a = new String[count];
                    for (int i = 0; i < count; i++) {
                        ((String[]) this.f5762a)[i] = query.getString(columnIndex);
                        query.moveToNext();
                    }
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e) {
            Log.e("TvSearchSuggestionsLdr", "Exception in loadInBackground()", e);
        } catch (Throwable th) {
            dhr.m6455a(th, th);
        }
        return (String[]) this.f5762a;
        throw th;
    }
}
