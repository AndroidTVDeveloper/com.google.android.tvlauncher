package defpackage;

import android.database.Cursor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cdr  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cdr implements cdv {
    private final cdt a;

    public cdr(cdt cdt) {
        this.a = cdt;
    }

    /* JADX INFO: finally extract failed */
    public final Object a() {
        Object obj;
        cdt cdt = this.a;
        Cursor query = cdt.a.query(cdt.b, cdt.f, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                Map emptyMap = Collections.emptyMap();
                query.close();
                return emptyMap;
            }
            if (count <= 256) {
                obj = new cl(count);
            } else {
                obj = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                obj.put(query.getString(0), query.getString(1));
            }
            query.close();
            return obj;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }
}
