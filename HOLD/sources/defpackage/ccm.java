package defpackage;

import android.os.SystemClock;

/* renamed from: ccm  reason: default package */
/* compiled from: PG */
public final class ccm {
    public final long a;
    public long b = -1;

    static {
        new ccm();
    }

    public ccm() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a = elapsedRealtime;
    }

    public ccm(long j, long j2) {
        int indexOf;
        int i = 0;
        Object[] objArr = {Long.valueOf(j2), Long.valueOf(j)};
        if (j2 >= j) {
            this.a = j;
            this.b = j2;
            return;
        }
        StringBuilder sb = new StringBuilder(68);
        int i2 = 0;
        while (i < 2 && (indexOf = "End time %s is before start time %s.".indexOf("%s", i2)) != -1) {
            sb.append("End time %s is before start time %s.".substring(i2, indexOf));
            sb.append(objArr[i]);
            i++;
            i2 = indexOf + 2;
        }
        sb.append("End time %s is before start time %s.".substring(i2));
        if (i < 2) {
            sb.append(" [");
            sb.append(objArr[i]);
            if (i + 1 < 2) {
                sb.append(", ");
                sb.append(objArr[1]);
            }
            sb.append(']');
        }
        throw new IllegalArgumentException(sb.toString());
    }
}
