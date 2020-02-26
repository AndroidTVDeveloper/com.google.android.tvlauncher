package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: aps */
/* compiled from: PG */
final class aps extends apu {

    /* renamed from: a */
    public final long f1731a;

    /* renamed from: b */
    public final List f1732b = new ArrayList();

    /* renamed from: c */
    public final List f1733c = new ArrayList();

    public aps(int i, long j) {
        super(i);
        this.f1731a = j;
    }

    /* renamed from: a */
    public final void mo1236a(aps aps) {
        this.f1733c.add(aps);
    }

    /* renamed from: a */
    public final void mo1237a(apt apt) {
        this.f1732b.add(apt);
    }

    /* renamed from: b */
    public final aps mo1238b(int i) {
        int size = this.f1733c.size();
        for (int i2 = 0; i2 < size; i2++) {
            aps aps = (aps) this.f1733c.get(i2);
            if (aps.f1735d == i) {
                return aps;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final apt mo1235a(int i) {
        int size = this.f1732b.size();
        for (int i2 = 0; i2 < size; i2++) {
            apt apt = (apt) this.f1732b.get(i2);
            if (apt.f1735d == i) {
                return apt;
            }
        }
        return null;
    }

    public final String toString() {
        String e = m1769e(this.f1735d);
        String arrays = Arrays.toString(this.f1732b.toArray());
        String arrays2 = Arrays.toString(this.f1733c.toArray());
        int length = String.valueOf(e).length();
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append(e);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
