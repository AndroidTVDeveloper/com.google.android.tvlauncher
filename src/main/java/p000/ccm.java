package p000;

import android.os.SystemClock;

/* renamed from: ccm */
/* compiled from: PG */
public final class ccm {

    /* renamed from: a */
    public final long f5276a;

    /* renamed from: b */
    public long f5277b = -1;

    static {
        new ccm();
    }

    public ccm() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f5276a = elapsedRealtime;
    }

    public ccm(long j, long j2) {
        int indexOf;
        int i = 0;
        Object[] objArr = {Long.valueOf(j2), Long.valueOf(j)};
        if (j2 >= j) {
            this.f5276a = j;
            this.f5277b = j2;
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
