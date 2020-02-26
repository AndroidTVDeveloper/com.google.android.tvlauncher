package p000;

import android.database.Cursor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cdr */
/* compiled from: PG */
final /* synthetic */ class cdr implements cdv {

    /* renamed from: a */
    private final cdt f5332a;

    public cdr(cdt cdt) {
        this.f5332a = cdt;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Object mo2683a() {
        Object obj;
        cdt cdt = this.f5332a;
        Cursor query = cdt.f5336a.query(cdt.f5337b, cdt.f5334f, null, null, null);
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
                obj = new C0067cl(count);
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
