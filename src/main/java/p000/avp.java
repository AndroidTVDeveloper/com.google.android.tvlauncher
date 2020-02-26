package p000;

/* renamed from: avp */
/* compiled from: PG */
public abstract class avp implements atv {
    /* renamed from: a */
    public final akh mo1253a() {
        return null;
    }

    /* renamed from: b */
    public final byte[] mo1254b() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        return valueOf.length() == 0 ? new String("SCTE-35 splice command: type=") : "SCTE-35 splice command: type=".concat(valueOf);
    }
}
