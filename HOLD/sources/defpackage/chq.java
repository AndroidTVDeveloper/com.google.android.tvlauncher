package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: chq  reason: default package */
/* compiled from: PG */
final class chq {
    public final ArrayList a = new ArrayList();

    public static final int a(int i, int i2) {
        return (i << 2) + i2;
    }

    public final void a() {
        this.a.clear();
    }

    /* access modifiers changed from: package-private */
    public final Pair a(chn chn) {
        return a(this.a.indexOf(chn));
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return (this.a.size() + 3) / 4;
    }

    static Pair a(int i) {
        if (i != -1) {
            return new Pair(Integer.valueOf(i / 4), Integer.valueOf(i % 4));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final List b(int i) {
        if (i <= b() - 1) {
            return this.a.subList(a(i, 0), Math.min(a(i, 4), this.a.size()));
        }
        int b = b();
        StringBuilder sb = new StringBuilder(80);
        sb.append("Row index out of bounds. Given Index : ");
        sb.append(i);
        sb.append(". Number of Rows : ");
        sb.append(b);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    public final Pair b(chn chn) {
        Pair a2 = a(chn);
        this.a.remove(chn);
        return a2;
    }

    public final void a(ArrayList arrayList) {
        this.a.clear();
        this.a.addAll(arrayList);
    }

    public final int c() {
        return this.a.size();
    }
}
