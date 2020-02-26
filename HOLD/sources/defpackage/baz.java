package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: baz  reason: default package */
/* compiled from: PG */
final class baz extends LinkedHashMap {
    private final /* synthetic */ int a = 4;

    public baz() {
        super(5, 1.0f, false);
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.a;
    }
}
