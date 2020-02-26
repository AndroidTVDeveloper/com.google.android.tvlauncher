package p000;

import android.net.Uri;
import android.util.LruCache;

/* renamed from: cxf */
/* compiled from: PG */
final class cxf extends LruCache {
    public cxf() {
        super(10);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Uri uri = (Uri) obj;
        cxh cxh = (cxh) obj2;
        if (((cxh) obj3) != null) {
            cxh.mo3931a();
        }
    }
}
