package p000;

import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: bih */
/* compiled from: PG */
public final class bih implements bip {

    /* renamed from: a */
    private final int f4068a;

    public bih() {
        this(-1);
    }

    /* renamed from: a */
    public final int mo1973a(int i) {
        int i2 = this.f4068a;
        return i2 == -1 ? i != 7 ? 3 : 6 : i2;
    }

    public bih(int i) {
        this.f4068a = i;
    }

    /* renamed from: a */
    public final long mo1974a(IOException iOException) {
        if (!(iOException instanceof bim)) {
            return -9223372036854775807L;
        }
        int i = ((bim) iOException).f4076a;
        if (i == 404 || i == 410) {
            return 60000;
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    public final long mo1975a(IOException iOException, int i) {
        if ((iOException instanceof ako) || (iOException instanceof FileNotFoundException) || (iOException instanceof biw)) {
            return -9223372036854775807L;
        }
        return (long) Math.min((i - 1) * 1000, 5000);
    }
}
