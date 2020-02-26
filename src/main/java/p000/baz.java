package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: baz */
/* compiled from: PG */
final class baz extends LinkedHashMap {

    /* renamed from: a */
    private final /* synthetic */ int f3045a = 4;

    public baz() {
        super(5, 1.0f, false);
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.f3045a;
    }
}
