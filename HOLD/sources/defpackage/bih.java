package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: bih  reason: default package */
/* compiled from: PG */
public final class bih implements bip {
    private final int a;

    public bih() {
        this(-1);
    }

    public final int a(int i) {
        int i2 = this.a;
        return i2 == -1 ? i != 7 ? 3 : 6 : i2;
    }

    public bih(int i) {
        this.a = i;
    }

    public final long a(IOException iOException) {
        if (!(iOException instanceof bim)) {
            return -9223372036854775807L;
        }
        int i = ((bim) iOException).a;
        if (i == 404 || i == 410) {
            return 60000;
        }
        return -9223372036854775807L;
    }

    public final long a(IOException iOException, int i) {
        if ((iOException instanceof ako) || (iOException instanceof FileNotFoundException) || (iOException instanceof biw)) {
            return -9223372036854775807L;
        }
        return (long) Math.min((i - 1) * 1000, 5000);
    }
}
