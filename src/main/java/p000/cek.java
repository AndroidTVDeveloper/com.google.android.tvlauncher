package p000;

import java.io.Serializable;
import java.util.Locale;

/* renamed from: cek */
/* compiled from: PG */
public final class cek implements Serializable {
    public static final long serialVersionUID = 1;

    /* renamed from: a */
    public final int f5375a;

    /* renamed from: b */
    private final boolean f5376b;

    public cek(int i) {
        this(i, false);
    }

    public final int hashCode() {
        return this.f5375a + 527;
    }

    public cek(int i, boolean z) {
        this.f5375a = i;
        this.f5376b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof cek) && this.f5375a == ((cek) obj).f5375a;
        }
        return true;
    }

    public final String toString() {
        return String.format(Locale.US, "VisualElementTag {id: %d, isRootPage: %b}", Integer.valueOf(this.f5375a), Boolean.valueOf(this.f5376b));
    }
}
