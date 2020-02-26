package defpackage;

import java.util.Comparator;

/* renamed from: cod  reason: default package */
/* compiled from: PG */
final class cod implements Comparator {
    private cod() {
    }

    public /* synthetic */ cod(byte b) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return (((clw) obj).b > ((clw) obj2).b ? 1 : (((clw) obj).b == ((clw) obj2).b ? 0 : -1));
    }
}
