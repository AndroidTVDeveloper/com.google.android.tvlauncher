package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;

/* renamed from: clc  reason: default package */
/* compiled from: PG */
public final class clc extends cjw {
    public clc(Context context) {
        super(context, cts.b);
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Cursor query;
        this.a = null;
        try {
            query = getContext().getContentResolver().query(cts.b, null, null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    int count = query.getCount();
                    int columnIndex = query.getColumnIndex("suggestion");
                    this.a = new String[count];
                    for (int i = 0; i < count; i++) {
                        ((String[]) this.a)[i] = query.getString(columnIndex);
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
            dhr.a(th, th);
        }
        return (String[]) this.a;
        throw th;
    }
}
