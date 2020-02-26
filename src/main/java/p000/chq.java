package p000;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: chq */
/* compiled from: PG */
final class chq {

    /* renamed from: a */
    public final ArrayList f5580a = new ArrayList();

    /* renamed from: a */
    public static final int m4747a(int i, int i2) {
        return (i << 2) + i2;
    }

    /* renamed from: a */
    public final void mo2821a() {
        this.f5580a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Pair mo2820a(chn chn) {
        return m4748a(this.f5580a.indexOf(chn));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo2823b() {
        return (this.f5580a.size() + 3) / 4;
    }

    /* renamed from: a */
    static Pair m4748a(int i) {
        if (i != -1) {
            return new Pair(Integer.valueOf(i / 4), Integer.valueOf(i % 4));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final List mo2825b(int i) {
        if (i <= mo2823b() - 1) {
            return this.f5580a.subList(m4747a(i, 0), Math.min(m4747a(i, 4), this.f5580a.size()));
        }
        int b = mo2823b();
        StringBuilder sb = new StringBuilder(80);
        sb.append("Row index out of bounds. Given Index : ");
        sb.append(i);
        sb.append(". Number of Rows : ");
        sb.append(b);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Pair mo2824b(chn chn) {
        Pair a = mo2820a(chn);
        this.f5580a.remove(chn);
        return a;
    }

    /* renamed from: a */
    public final void mo2822a(ArrayList arrayList) {
        this.f5580a.clear();
        this.f5580a.addAll(arrayList);
    }

    /* renamed from: c */
    public final int mo2826c() {
        return this.f5580a.size();
    }
}
