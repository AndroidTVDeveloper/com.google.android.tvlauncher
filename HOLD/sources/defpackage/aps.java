package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: aps  reason: default package */
/* compiled from: PG */
final class aps extends apu {
    public final long a;
    public final List b = new ArrayList();
    public final List c = new ArrayList();

    public aps(int i, long j) {
        super(i);
        this.a = j;
    }

    public final void a(aps aps) {
        this.c.add(aps);
    }

    public final void a(apt apt) {
        this.b.add(apt);
    }

    public final aps b(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            aps aps = (aps) this.c.get(i2);
            if (aps.d == i) {
                return aps;
            }
        }
        return null;
    }

    public final apt a(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            apt apt = (apt) this.b.get(i2);
            if (apt.d == i) {
                return apt;
            }
        }
        return null;
    }

    public final String toString() {
        String e = e(this.d);
        String arrays = Arrays.toString(this.b.toArray());
        String arrays2 = Arrays.toString(this.c.toArray());
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
