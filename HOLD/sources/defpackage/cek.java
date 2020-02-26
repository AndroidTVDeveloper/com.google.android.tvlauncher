package defpackage;

import java.io.Serializable;
import java.util.Locale;

/* renamed from: cek  reason: default package */
/* compiled from: PG */
public final class cek implements Serializable {
    public static final long serialVersionUID = 1;
    public final int a;
    private final boolean b;

    public cek(int i) {
        this(i, false);
    }

    public final int hashCode() {
        return this.a + 527;
    }

    public cek(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof cek) && this.a == ((cek) obj).a;
        }
        return true;
    }

    public final String toString() {
        return String.format(Locale.US, "VisualElementTag {id: %d, isRootPage: %b}", Integer.valueOf(this.a), Boolean.valueOf(this.b));
    }
}
